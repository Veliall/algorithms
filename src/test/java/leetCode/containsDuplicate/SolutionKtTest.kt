package leetCode.containsDuplicate

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtTest {

    private val solution = SolutionKt();
    @Test
    fun containsDuplicate() {
        val expected = true
        val actual = solution.containsDuplicate(intArrayOf(1, 2, 3, 1))

        assertEquals(expected, actual)
    }

    @Test
    fun containsDuplicate2() {
        val expected = false
        val actual = solution.containsDuplicate(intArrayOf(1, 2, 3, 4))
        assertEquals(expected, actual)
    }

    @Test
    fun containsDuplicate3() {
        val expected = true
        val actual = solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
        assertEquals(expected, actual)
    }
}