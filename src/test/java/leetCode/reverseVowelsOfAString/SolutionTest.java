package leetCode.reverseVowelsOfAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void reverseVowels() {
        String expected = "holle";
        String actual = solution.reverseVowels("hello");

        assertEquals(expected, actual);
    }

    @Test
    void reverseVowels2() {
        String expected = "leotcede";
        String actual = solution.reverseVowels("leetcode");

        assertEquals(expected, actual);
    }
}