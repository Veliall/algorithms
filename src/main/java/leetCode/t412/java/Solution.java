package leetCode.t412.java;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add(fizzBuzz);
            } else if (i % 3 == 0) {
                result.add(fizz);
            } else if (i % 5 == 0) {
                result.add(buzz);
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
