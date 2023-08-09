package leetCode.isSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;
        char[] subSec = s.toCharArray();
        char[] sec = t.toCharArray();

        int subSecIndex = 0;
        for (int i = 0; i < sec.length; i++) {
            if (sec[i] == subSec[subSecIndex]) {
                if (subSecIndex == subSec.length - 1) {
                    return true;
                }
                subSecIndex++;
            }
        }

        return false;
    }
}
