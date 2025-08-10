package algorithms.easy

class CanPlaceFlowers {

    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var flowerCount = 0
        for (i in flowerbed.indices) {
            if (flowerbed[i] != 0) {
                continue
            }

            val leftEmpty = i == 0 || flowerbed[i - 1] == 0
            val rightEmpty = i == flowerbed.lastIndex || flowerbed[i + 1] == 0
            if (leftEmpty && rightEmpty) {
                flowerbed[i] = 1
                flowerCount++
            }
        }
        return flowerCount >= n
    }
}
