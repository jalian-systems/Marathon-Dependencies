require 'test/unit'
require 'zlib'
require 'stringio'

class TestZlib < Test::Unit::TestCase
  def teardown;  File.unlink @filename if @filename; end

  def test_inflate_deflate
    s = "test comression string"
    [Zlib::NO_COMPRESSION, Zlib::BEST_SPEED, Zlib::BEST_COMPRESSION, Zlib::DEFAULT_COMPRESSION].each do |level|
      assert_equal(s, Zlib::Inflate.inflate(Zlib::Deflate.deflate(s, level)))
    end
  end
  
  # Zlib::Inflate uses org.jruby.util.ZlibInflate for low-level decompression logic, which is built around
  # java.util.zip.Inflater.
  #
  # Inflater, and hence ZlibInflate, can run in one of two basic modes:
  #
  # - "wrapped" IO stream: when working with an input stream that will contain
  #   Zlib headers and checksum
  # - "unwrapped" IO stream: input streams that do not contain Zlib headers
  #   and checksum
  #
  # This tests whether an instance of Zlib::Inflate correctly reports its completion status
  # after decompressing the full contents of an unwrapped input stream.
  #
  def test_inflate_should_be_finished_after_decompressing_full_unwrapped_stream
      actual = "test compression string\n" * 5

      # This is a base64-encoded representation of a zipped text file.
      # This is not the ZIP archive itself; rather, it is the compressed representation
      # of a deflated file inside the archive.
      data = "K0ktLlFIzs8tKEotLs7Mz1MoLinKzEvnKqGxOABQSwECFwMUAAIACAAxKng3dpOMHR0AAAB4AAAACAANAAAAAAABAAAApIEAAAAAdGVzdC50eHRVVAUAAz76R0dVeAAAUEsFBgAAAAABAAEAQwAAAFgAAAAAAA=="
              
      inflater = Zlib::Inflate.new(-Zlib::MAX_WBITS)
      
      stream = StringIO.new(data.unpack('m*')[0])
      assert_equal(actual, inflater.inflate(stream.read(nil, '')), "Unexpected result of decompression.")
      assert(inflater.finished?, "Inflater should be finished after inflating all input.")
  end

  def test_gzip_reader_writer
    @filename = "____temp_zlib_file";
    
    Zlib::GzipWriter.open(@filename) { |z| z.puts 'HEH' }
    Zlib::GzipReader.open(@filename) do |z|
      assert_equal("HEH\n", z.gets)
      assert_nil z.getc
      assert z.eof?
    end
    File.unlink(@filename)
    
    Zlib::GzipWriter.open(@filename) { |z| z.write "HEH\n" }
    Zlib::GzipReader.open(@filename) do |z|
      assert_equal("HEH\n", z.gets)
      assert_nil z.getc
      assert z.eof?
    end
    File.unlink(@filename)
    

    z = Zlib::GzipWriter.open(@filename)
    z.puts 'HOH'
    z.puts 'foo|bar'
    z.close
    
    z = Zlib::GzipReader.open(@filename)
    assert_equal("HOH\n", z.gets)
    assert_equal("foo|", z.gets("|"))
    assert_equal("bar\n", z.gets)
    z.close
  end
  
  def test_native_exception_from_zlib_on_broken_header
    corrupt = StringIO.new
    corrupt.write('borkborkbork')
    begin
      Zlib::GzipReader.new(corrupt)
      flunk()
    rescue Zlib::GzipReader::Error
    end
  end
  
  def test_deflate_positive_winbits
    d =  Zlib::Deflate.new(Zlib::DEFAULT_COMPRESSION, Zlib::MAX_WBITS)
    d << 'hello'
    res = d.finish
    assert_equal("x\234\313H\315\311\311\a\000\006,\002\025", res)
  end
  
   # negative winbits means no header and no checksum.
   def test_deflate_negative_winbits
     d =  Zlib::Deflate.new(Zlib::DEFAULT_COMPRESSION, -Zlib::MAX_WBITS)
     d << 'hello'
     res = d.finish
     assert_equal("\313H\315\311\311\a\000", res)
  end

  # JRUBY-2228
  def test_gzipreader_descriptor_leak
    @filename = "____temp_zlib_file";
    Zlib::GzipWriter.open(@filename) { |z| z.puts 'HEH' }

    ios = [] # to prevent opened files GC'ed
    assert_nothing_raised() {
      2048.times {
        z = Zlib::GzipReader.open(@filename)
        z.close
        ios << z
      }
    }
  end

  def test_wrap
    content = StringIO.new "", "r+"
    
    Zlib::GzipWriter.wrap(content) do |io|
      io.write "hello\nworld\n"
    end

    content = StringIO.new content.string, "rb"

    gin = Zlib::GzipReader.new(content)
    assert_equal("hello\n", gin.gets)
    assert_equal("world\n", gin.gets)
    assert_nil gin.gets
    assert gin.eof?
    gin.close
  end
  
  def test_each_line_no_block
    @filename = "____temp_zlib_file";
    Zlib::GzipWriter.open(@filename) { |io| io.write "hello\nworld\n" }
    lines = []
    z = Zlib::GzipReader.open(@filename)
    z.each_line do |line|
      lines << line
    end
    z.close
    
    assert_equal(2, lines.size, lines.inspect)
    assert_equal("hello\n", lines.first)
    assert_equal("world\n", lines.last)
  end
  
  def test_each_line_block
    @filename = "____temp_zlib_file";
    Zlib::GzipWriter.open(@filename) { |io| io.write "hello\nworld\n" }
    lines = []
    Zlib::GzipReader.open(@filename) do |z|
      z.each_line do |line|
        lines << line
      end
    end
    assert_equal(2, lines.size, lines.inspect)
  end
  
  def test_empty_line
    @filename = "____temp_zlib_file";
    Zlib::GzipWriter.open(@filename) { |io| io.write "hello\nworld\n\ngoodbye\n" }
    lines = nil
    Zlib::GzipReader.open(@filename) do |z|
      lines = z.readlines
    end
    assert_equal(4, lines.size, lines.inspect)
  end

  def test_inflate_empty_string
    assert_raise(Zlib::BufError) { Zlib::Inflate.inflate('') }
  end

  def test_inflate_bad_data
    assert_raise(Zlib::DataError) { Zlib::Inflate.inflate('        ')}
  end

  def test_inflate_finish
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')
    assert_equal('foo', z.finish)

    assert(z.finished?)
    assert(!z.closed?)
    assert(!z.ended?)
  end

  def test_inflate_close
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')
    z.close

    assert (z.closed?)
    assert (z.ended?)

    assert_raise(Zlib::Error) { z.finish }
    assert_raise(Zlib::Error) { z.finished? }
  end

  def test_inflate_end
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')
    z.end

    assert (z.closed?)
    assert (z.ended?)

    assert_raise(Zlib::Error) { z.finish }
    assert_raise(Zlib::Error) { z.finished? }
  end

  def test_inflate_incomplete
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')[0, 1]
    assert_raise(Zlib::BufError) { z.finish }

    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')[0, 1]
    assert_raise(Zlib::BufError) { z.inflate(nil) }
  end

  def test_inflate_finished
    z = Zlib::Inflate.new
    assert(!z.finished?)
    z << Zlib::Deflate.deflate('foo')
    assert(z.finished?)

    # on incomplete data
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')[0, 1]
    assert(!z.finished?)
  end

  def test_inflate_flush_next_in
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')
    assert_equal("", z.flush_next_in)
    assert_equal("foo", z.finish)
    assert_equal("", z.flush_next_in)
  end

  # TODO: JRuby doesn't fully support this
  # very low-level Inflate#sync method, so
  # we just always return false.
  def test_inflate_sync
    z = Zlib::Inflate.new
    z << Zlib::Deflate.deflate('foo')
    assert (!z.sync(''))
    assert (!z.sync_point?)
    assert_equal("foo", z.finish)
    assert (!z.sync(''))
    assert (!z.sync_point?)
  end

  # JRUBY-4502: 1.4 raises native exception at gz.read
  def test_corrupted_data
    data = '12345abcde'
    zip = "\037\213\b\000,\334\321G\000\005\000\235\005\000$\n\000\000"
    io = StringIO.new(zip)
    # JRuby cannot check corrupted data format at GzipReader.new for now
    # because of different input buffer handling.
    if defined?(JRUBY_VERSION)
      assert_raise(IOError) do
        gz = Zlib::GzipReader.new(io)     # CRuby raises here
        gz.read                           # JRuby raises here
      end
    else
      assert_raise(Zlib::DataError) do
        gz = Zlib::GzipReader.new(io)     # CRuby raises here
      end
    end
  end

  def test_inflate_after_finish
    z = Zlib::Inflate.new
    data = "x\234c`\200\001\000\000\n\000\001"
    unzipped = z.inflate data
    z.finish  # this is a precondition

    out = z.inflate('uncompressed_data')
    out << z.finish
    assert_equal('uncompressed_data', out)
    z << ('uncompressed_data') << nil
    assert_equal('uncompressed_data', z.finish)
  end

  def test_inflate_pass_through
    main_data = "x\234K\313\317\a\000\002\202\001E"
    result = ""
    z = Zlib::Inflate.new
    # add bytes, one by one
    (main_data * 2).each_byte { |d| result << z.inflate(d.chr)}
    assert_equal("foo", result)
    # the first chunk is inflated to its completion,
    # the second chunk is just passed through.
    result << z.finish
    assert_equal("foo" + main_data, result)
  end

  # JRUBY-4503: cruby-zlib does not require 'close'
  def test_gzip_writer_restricted_io
    z = Object.new
    def z.write(arg)
      (@buf ||= []) << arg
    end
    def z.buf
      @buf
    end
    assert_nil z.buf
    Zlib::GzipWriter.wrap(z) { |io| io.write("hello") }
    assert_not_nil z.buf
  end

  # JRUBY-4503: cruby-zlib does not require 'close'
  def test_gzip_reader_restricted_io
    z = Object.new
    def z.read(size)
      @buf ||= TestZlib.create_gzip_stream("hello")
      @buf.slice!(0, size)
    end
    called = false
    Zlib::GzipReader.wrap(z) { |io|
      assert_equal("hello", io.read)
      called = true
    }
    assert(called)
  end

  # JRUBY-4503: trailer CRC check failed
  def test_gzip_reader_trailer_from_buffer
    z = Object.new
    def z.read(size)
      @buf ||= TestZlib.create_gzip_stream("hello")
      # emulate sliced buffer reading
      @buf.slice!(0, 1)
    end
    called = false
    Zlib::GzipReader.wrap(z) { |io|
      assert_equal("hello", io.read)
      called = true
    }
    assert(called)
  end

  def self.create_gzip_stream(string)
    s = StringIO.new
    Zlib::GzipWriter.wrap(s) { |io|
      io.write("hello")
    }
    s.string
  end
end
