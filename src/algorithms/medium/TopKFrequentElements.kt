package algorithms.medium

import java.util.*

fun main() {
    println(TopKFrequentElements.topKFrequent(intArrayOf(1, 1, 2, 1, 2, 3), 2).contentToString()) // [1,2]
}

object TopKFrequentElements {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val counts = mutableMapOf<Int, Int>()
        val freq = buildList {
            for (i in 0..nums.size + 1) {
                add(mutableListOf<Int>())
            }
        }

        for (num in nums) {
            counts[num] = counts.getOrDefault(num, 0) + 1
        }

        counts.forEach { (num, count) ->
            freq[count].add(num)
        }

        val result = IntArray(k)
        var foundCount = 0
        for (i in freq.lastIndex downTo 0) {
            for (num in freq[i]) {
                result[foundCount] = num
                foundCount++

                if (foundCount == k) return result
            }
        }

        return result
    }
}
