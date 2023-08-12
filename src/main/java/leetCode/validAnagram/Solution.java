package leetCode.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    // speed O(n) space O(n) where n is s + t
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sLetters = decomposeString(s);
        HashMap<Character, Integer> tLetters = decomposeString(t);

        if (sLetters.size() != tLetters.size()) return false;

        for (Map.Entry<Character, Integer> entry : sLetters.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (tLetters.get(key) == null || !tLetters.get(key).equals(value)) return false;
        }

        return true;
    }

    private HashMap<Character, Integer> decomposeString(String string) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (char character : string.toCharArray()) {
            if (result.containsKey(character)) {
                result.put(character, result.get(character) + 1);
            } else {
                result.put(character, 1);
            }
        }

        return result;
    }

}
