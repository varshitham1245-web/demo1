package com.demo.uc6.patterns;

public class OPSPatterns {
    /** Returns the specific line for the character 'O' */
    public static String getOPattern(int line) {
        String[] o = {
            "  * ", 
            " * * ", 
            " * * ", 
            " * * ", 
            " * * ", 
            " * * ", 
            "  * "
        };
        return o[line];
    }

    /** Returns the specific line for the character 'P' */
    public static String getPPattern(int line) {
        String[] p = {
            " *** ", 
            " * * ", 
            " * * ", 
            " *** ", 
            " * ", 
            " * ", 
            " * "
        };
        return p[line];
    }

    /** Returns the specific line for the character 'S' */
    public static String getSPattern(int line) {
        String[] s = {
            "  ** ", 
            " * ", 
            " * ", 
            "  * ", 
            "     * ", 
            "     * ", 
            " ** "
        };
        return s[line];
    }
}
