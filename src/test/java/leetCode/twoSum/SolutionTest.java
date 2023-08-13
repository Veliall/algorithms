package leetCode.twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void twoSum() {
        int[] given = {2,7,11,15};
        int[] expected = {0,1};
        int[] actual = solution.twoSum(given, 9);
        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum2() {
        int[] given = {3,2,4};
        int[] expected = {1,2};
        int[] actual = solution.twoSum(given, 6);
        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum3() {
        int[] given = {3,3};
        int[] expected = {0,1};
        int[] actual = solution.twoSum(given, 6);
        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }
}