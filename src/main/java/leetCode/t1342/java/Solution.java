package leetCode.t1342.java;

class Solution {
    public int numberOfSteps(int num) {
        int result = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }
            result++;
        }
        return result;
    }
}
