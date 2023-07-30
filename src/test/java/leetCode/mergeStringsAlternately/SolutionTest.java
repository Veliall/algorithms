package leetCode.mergeStringsAlternately;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    SolutionWithCharArray solutionWithCharArray = new SolutionWithCharArray();
    SolutionWithStringBuilder solutionWithStringBuilder = new SolutionWithStringBuilder();
    @Test
    @DisplayName("Input: word1 = \"abc\", word2 = \"pqr\" Output: \"apbqcr\"")
    void mergeAlternately() {
        String expected = "apbqcr";
        String actual = solutionWithCharArray.mergeAlternately("abc", "pqr");
        String actual2 = solutionWithStringBuilder.mergeAlternately("abc", "pqr");
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    @DisplayName("Input: word1 = \"ab\", word2 = \"pqrs\" Output: \"apbqrs\"")
    void mergeAlternatelySecondLonger() {
        String expected = "apbqrs";
        String actual = solutionWithCharArray.mergeAlternately("ab", "pqrs");
        String actual2 = solutionWithStringBuilder.mergeAlternately("ab", "pqrs");
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    @DisplayName("Input: word1 = \"abcd\", word2 = \"pq\" Output: \"apbqcd\"")
    void mergeAlternatelyFirstLonger() {
        String expected = "apbqcd";
        String actual = solutionWithCharArray.mergeAlternately("abcd", "pq");
        String actual2 = solutionWithStringBuilder.mergeAlternately("abcd", "pq");
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }
}