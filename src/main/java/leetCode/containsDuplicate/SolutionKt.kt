package leetCode.containsDuplicate

class SolutionKt {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        for (integer in nums) {
            if (hashSet.contains(integer)) {
                return true
            }
            hashSet.add(integer)
        }
        return false
    }
}