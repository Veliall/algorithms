package leetCode.reverseWordsInAString;

public class Solution {
    public String reverseWords(String s) {
        String trimmed = s.trim();
        String result = trimmed.replaceAll(" +", " ");
        String[] split = result.split(" ");

        int j = split.length - 1;
        for (int i = 0; i < split.length; i++) {
            if (j <= i) break;
            String str1 = split[i];
            String str2 = split[j];

            split[i] = str2;
            split[j] = str1;

            j--;
        }
        return String.join(" ", split);
    }
}
