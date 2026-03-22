package com.demo.uc8;

import java.util.HashMap;
import java.util.Map;
import com.demo.uc8.patterns.CharacterPattern;
import com.demo.uc8.patterns.BannerRenderer;

public class OOPSBannerApp {

    public static void main(String[] args) {
        // 2. Initialize the Registry (Map)
        Map<Character, CharacterPattern> patternMap = new HashMap<>();
        
        // Populating the registry
        patternMap.put('O', new CharacterPattern(new String[]{
            "  * ", " * * ", " * * ", " * * ", " * * ", " * * ", "  * "
        }));
        
        patternMap.put('P', new CharacterPattern(new String[]{
            " ** ", " * * ", " * * ", " ** ", " * ", " * ", " * "
        }));
        
        patternMap.put('S', new CharacterPattern(new String[]{
            "  ** ", " * ", " * ", "  * ", "      ", "      *", " *** "
        }));

        // 3. Render the word "OOPS"
        BannerRenderer.renderBanner("OOPS", patternMap);
    }
}
