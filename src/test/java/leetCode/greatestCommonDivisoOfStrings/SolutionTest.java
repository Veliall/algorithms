package leetCode.greatestCommonDivisoOfStrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    @DisplayName("Input: str1 = \"ABCABC\", str2 = \"ABC\" Output: \"ABC\"")
    void gcdOfStrings() {
        String expected = "ABC";
        String actual = solution.gcdOfStrings("ABCABC", "ABC");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Input: str1 = \"ABABAB\", str2 = \"ABAB\" Output: \"AB\"")
    void gcdOfStrings2() {
        String expected = "AB";
        String actual = solution.gcdOfStrings("ABABAB", "ABAB");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Input: str1 = \"LEET\", str2 = \"CODE\" Output: \"\"")
    void gcdOfStrings3() {
        String expected = "";
        String actual = solution.gcdOfStrings("LEET", "CODE");

        assertEquals(expected, actual);
    }
}