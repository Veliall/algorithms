package leetCode.containsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void containsDuplicate() {
        boolean expected = true;
        boolean actual = solution.containsDuplicate(new int[]{1,2,3,1});

        assertEquals(expected, actual);
    }

    @Test
    void containsDuplicate2() {
        boolean expected = false;
        boolean actual = solution.containsDuplicate(new int[]{1,2,3,4});

        assertEquals(expected, actual);
    }

    @Test
    void containsDuplicate3() {
        boolean expected = true;
        boolean actual = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});

        assertEquals(expected, actual);
    }
}