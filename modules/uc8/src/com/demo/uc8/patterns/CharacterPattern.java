package com.demo.uc8.patterns;

public class CharacterPattern {
    private final String[] pattern;

    public CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String getLine(int index) {
        return (index >= 0 && index < pattern.length) ? pattern[index] : "         ";
    }
}
