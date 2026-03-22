package com.demo.uc6;

import com.demo.uc6.patterns.OPSPatterns;

public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Array Initialization via Method Invocations
        // We call the helper methods directly within the array literal.
        // Note: getOPattern() is called twice, reusing the same logic!
        String[] bannerLines = {
            String.join("", OPSPatterns.getOPattern(0), OPSPatterns.getOPattern(0), OPSPatterns.getPPattern(0), OPSPatterns.getSPattern(0)),
            String.join("", OPSPatterns.getOPattern(1), OPSPatterns.getOPattern(1), OPSPatterns.getPPattern(1), OPSPatterns.getSPattern(1)),
            String.join("", OPSPatterns.getOPattern(2), OPSPatterns.getOPattern(2), OPSPatterns.getPPattern(2), OPSPatterns.getSPattern(2)),
            String.join("", OPSPatterns.getOPattern(3), OPSPatterns.getOPattern(3), OPSPatterns.getPPattern(3), OPSPatterns.getSPattern(3)),
            String.join("", OPSPatterns.getOPattern(4), OPSPatterns.getOPattern(4), OPSPatterns.getPPattern(4), OPSPatterns.getSPattern(4)),
            String.join("", OPSPatterns.getOPattern(5), OPSPatterns.getOPattern(5), OPSPatterns.getPPattern(5), OPSPatterns.getSPattern(5)),
            String.join("", OPSPatterns.getOPattern(6), OPSPatterns.getOPattern(6), OPSPatterns.getPPattern(6), OPSPatterns.getSPattern(6))
        };

        // 2. Loop-Based Rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
