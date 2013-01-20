/***** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2001 Benoit Cerrina <b.cerrina@wanadoo.fr>
 * Copyright (C) 2001-2002 Jan Arne Petersen <jpetersen@uni-bonn.de>
 * Copyright (C) 2002 Anders Bengtsson <ndrsbngtssn@yahoo.se>
 * Copyright (C) 2004 Charles O Nutter <headius@headius.com>
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jruby.runtime;

public final class Constants {
    public static final String PLATFORM = "java";

    public static final int MARSHAL_MAJOR = 4;
    public static final int MARSHAL_MINOR = 8;

    public static final String RUBY_MAJOR_VERSION = "1.8";
    public static final String RUBY_VERSION = "1.8.7";
    public static final int    RUBY_PATCHLEVEL = Integer.parseInt("370");

    public static final String RUBY1_9_MAJOR_VERSION = "1.9";
    public static final String RUBY1_9_VERSION = "1.9.3";
    public static final int    RUBY1_9_PATCHLEVEL = Integer.parseInt("327");
    public static final int    RUBY1_9_REVISION = Integer.parseInt("37606");

    public static final String RUBY2_0_MAJOR_VERSION = "2.0";
    public static final String RUBY2_0_VERSION = "2.0.0dev";
    public static final int    RUBY2_0_PATCHLEVEL = Integer.parseInt("0");
//    public static final int    RUBY2_0_REVISION = Integer.parseInt("@version.ruby2_0.revision@");

    public static final String COMPILE_DATE = "2013-01-20";
    public static final String VERSION = "1.7.2";
    public static final String BUILD = "java1.6";
    public static final String TARGET = "java1.6";
    public static final String REVISION;
    public static final String ENGINE = "jruby";
    
    public static final String JODA_TIME_VERSION = "2.1";
    public static final String TZDATA_VERSION = "2011n";
    
    public static final String DEFAULT_RUBY_VERSION;
    
    /**
     * Default size for chained compilation.
     */
    public static final int CHAINED_COMPILE_LINE_COUNT_DEFAULT = 500;
    
    /**
     * The max count of active methods eligible for JIT-compilation.
     */
    public static final int JIT_MAX_METHODS_LIMIT = 4096;

    /**
     * The max size of JIT-compiled methods (full class size) allowed.
     */
    public static final int JIT_MAX_SIZE_LIMIT = 30000;

    /**
     * The JIT threshold to the specified method invocation count.
     */
    public static final int JIT_THRESHOLD = 50;

    @Deprecated
    public static final String JRUBY_PROPERTIES = "/org/jruby/jruby.properties";

    static {
        // This is populated here to avoid javac propagating the value to consumers
        REVISION = "b9020c7";
        String defaultRubyVersion = "1.9";
        if (defaultRubyVersion.equals("1.8")) {
            DEFAULT_RUBY_VERSION = "1.8";
        } else if (defaultRubyVersion.equals("1.9")) {
            DEFAULT_RUBY_VERSION = "1.9";
        } else {
            System.err.println("invalid version selected in build (\"" + defaultRubyVersion + "\"), using 1.8");
            DEFAULT_RUBY_VERSION = "1.8";
        }
    }

    private Constants() {}
}
