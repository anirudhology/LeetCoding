package com.anirudhology.leetcoding.string;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // Special cases
        if (s == null) {
            return t == null;
        }
        if (t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        // Lookup to store character frequencies
        char[] frequencies = new char[26];
        // Loop through the strings
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'a']++;
            frequencies[t.charAt(i) - 'a']--;
        }
        // If strings are anagram then all frequencies in the array should be 0
        for (int frequency : frequencies) {
            if (frequency != 0) {
                return false;
            }
        }
        return true;
    }
}
