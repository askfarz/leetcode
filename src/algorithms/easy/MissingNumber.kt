package algorithms.easy

class MissingNumber {

    // time complexity O(n), space complexity O(1)
    fun missingNumber2(nums: Array<Int>): Int {
        val n: Int = nums.size
        var sumOfElements = 0

        for (i in nums.indices) {
            sumOfElements += nums[i]
        }

        val expectedSumOfElements: Int = n * (n + 1) / 2

        return expectedSumOfElements - sumOfElements
    }

    // time complexity O(n), space complexity O(n)
    fun missingNumber1(nums: Array<Int>): Int {
        val n = nums.size

        val numsAsSet = HashSet<Int>()
        for (num in nums) {
            numsAsSet.add(num)
        }

        for (i in 0..n) {
            if (!numsAsSet.contains(i)) {
                return i
            }
        }
        return 0
    }
}
