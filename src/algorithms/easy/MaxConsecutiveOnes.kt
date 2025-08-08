package algorithms.easy

class MaxConsecutiveOnes {

    // O(n)
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxSeq = 0
        var currMaxSeq = 0
        for (num in nums) {
            if (num == 1) {
                currMaxSeq++
                maxSeq = maxOf(maxSeq, currMaxSeq)
            } else {
                currMaxSeq = 0
            }
        }
        return maxSeq
    }
}
