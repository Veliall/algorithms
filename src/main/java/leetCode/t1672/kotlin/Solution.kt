package leetCode.t1672.kotlin

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        return accounts.maxOfOrNull { it.sum() } ?: 0
    }

    fun maximumWealth2(accounts: Array<IntArray>): Int {
        var max = 0
        for (account in accounts) {
            var sum = 0
            for (amount in account) {
                sum += amount
            }
            if (sum > max) {
                max = sum
            }
        }
        return max
    }
}