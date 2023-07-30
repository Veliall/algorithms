package leetCode.mergeStringsAlternately;

public class SolutionWithCharArray {
    public String mergeAlternately(String word1, String word2) {

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        char[] result = new char[charArray1.length + charArray2.length];

        if (charArray1.length == charArray2.length) {
            int length = charArray1.length;
            mergeCommonLength(length, charArray1, charArray2, result);
        }

        if (charArray1.length > charArray2.length) {
            int length = charArray2.length;
            mergeCommonLength(length, charArray1, charArray2, result);

            int j = length * 2;
            for (int i = length; i < charArray1.length; i++) {
                result[j] = charArray1[i];
                j++;
            }
        } else {
            int length = charArray1.length;
            mergeCommonLength(length, charArray1, charArray2, result);

            int j = length * 2;
            for (int i = length; i < charArray2.length; i++) {
                result[j] = charArray2[i];
                j++;
            }
        }

        return String.valueOf(result);
    }

    private void mergeCommonLength(int length, char[] charArray1, char[] charArray2, char[] result) {
        int j = 0;
        for (int i = 0; i < length; i++) {
            result[j] = charArray1[i];
            j++;
            result[j] = charArray2[i];
            j++;
        }
    }
}
