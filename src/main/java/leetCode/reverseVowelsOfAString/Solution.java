package leetCode.reverseVowelsOfAString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {
    private final static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (vowels.contains((charArray[i]))) {
                indexes.add(i);
            }
        }

        int reverseIndex = indexes.size() - 1;
        for (int i = 0; i < indexes.size(); i++) {
            if (i >= reverseIndex) break;
            char ch1 = charArray[indexes.get(i)];
            char ch2 = charArray[indexes.get(reverseIndex)];

            charArray[indexes.get(i)] = ch2;
            charArray[indexes.get(reverseIndex)] = ch1;
            reverseIndex--;
        }


        return String.valueOf(charArray);
    }

}
