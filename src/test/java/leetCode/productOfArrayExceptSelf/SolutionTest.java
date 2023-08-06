package leetCode.productOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void productExceptSelf() {
        int[] given = {1,2,3,4};
        int[] expected = {24,12,8,6};
        int[] actual = solution.productExceptSelf(given);
        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    void productExceptSelf2() {
        int[] given = {-1,1,0,-3,3};
        int[] expected = {0,0,9,0,0};
        int[] actual = solution.productExceptSelf(given);
        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }
}