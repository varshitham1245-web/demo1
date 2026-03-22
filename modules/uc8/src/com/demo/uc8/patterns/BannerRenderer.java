package com.demo.uc8.patterns;

import java.util.Map;

public class BannerRenderer {
    /**
     * Dynamically renders a word as a banner using the provided pattern map.
     */
    public static void renderBanner(String word, Map<Character, CharacterPattern> map) {
        // We assume a 7-line height for all characters
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            // Loop through each character in the input word
            for (char c : word.toUpperCase().toCharArray()) {
                CharacterPattern cp = map.get(c);
                if (cp != null) {
                    lineBuilder.append(cp.getLine(i));
                } else {
                    // Fallback for missing characters (empty space)
                    lineBuilder.append("         "); 
                }
            }
            // Print the assembled line
            System.out.println(lineBuilder.toString());
        }
    }
}
