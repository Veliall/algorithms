package leetCode.t383.java;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            Integer charCount = characters.getOrDefault(c, characters.getOrDefault(c, 0));
            if (charCount <= 0) {
                return false;
            } else {
                characters.put(c, charCount - 1);
            }
        }
        return true;
    }

    public boolean canConstructWithoutExtraCharArray(String ransomNote, String magazine) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char charAt = ransomNote.charAt(i);
            Integer charCount = characters.getOrDefault(charAt, 0);
            if (charCount <= 0) {
                return false;
            }

            characters.put(charAt, charCount - 1);
        }
        return true;
    }
}
