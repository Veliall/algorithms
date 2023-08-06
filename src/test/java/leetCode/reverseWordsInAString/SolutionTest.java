package leetCode.reverseWordsInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void reverseWords() {
        String expected = "blue is sky the";
        String actual = solution.reverseWords("the sky is blue");

        assertEquals(expected, actual);
    }

    @Test
    void reverseWords2() {
        String expected = "world hello";
        String actual = solution.reverseWords("  hello world  ");

        assertEquals(expected, actual);
    }

    @Test
    void reverseWords3() {
        String expected = "example good a";
        String actual = solution.reverseWords("a good   example");

        assertEquals(expected, actual);
    }
}