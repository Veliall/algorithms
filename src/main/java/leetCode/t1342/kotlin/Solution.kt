package leetCode.t1342.kotlin

class Solution {
    fun numberOfSteps(num: Int): Int {
        var res = 0
        var number = num
        while (number > 0) {
            if (number % 2 == 0) {
                number /= 2
            } else {
                number -= 1
            }
            res++
        }
        return res
    }
}