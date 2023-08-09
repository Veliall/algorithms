package leetCode.isSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void isSubsequence() {
        boolean expected = true;
        boolean actual = solution.isSubsequence("abc","ahbgdc");

        assertEquals(expected, actual);
    }

    @Test
    void isSubsequence2() {
        boolean expected = false;
        boolean actual = solution.isSubsequence("axc","ahbgdc");

        assertEquals(expected, actual);
    }
}