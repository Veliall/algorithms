package leetCode.t412.kotlin

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val fizz = "Fizz"
        val buzz = "Buzz"
        val fizzbuzz = "FizzBuzz"

        val result = mutableListOf<String>()
        for (i in 1..n) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add(fizzbuzz)
            } else if (i % 5 == 0) {
                result.add(buzz)
            } else if (i % 3 == 0) {
                result.add(fizz)
            } else {
                result.add(i.toString())
            }
        }
        return result
    }
}