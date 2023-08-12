package leetCode.validAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void isAnagram() {
        boolean expected = true;
        boolean actual = solution.isAnagram("anagram", "nagaram");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram2() {
        boolean expected = false;
        boolean actual = solution.isAnagram("rat", "car");

        assertEquals(expected, actual);
    }
}