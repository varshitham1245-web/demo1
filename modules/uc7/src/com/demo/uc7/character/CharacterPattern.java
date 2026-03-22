package com.demo.uc7.character;

public class CharacterPattern {
    private final char character;
    private final String[] pattern;

    // Constructor to initialize the object
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String getLine(int index) {
        return pattern[index];
    }
    
    public char getCharacter() {
        return character;
    }
}
