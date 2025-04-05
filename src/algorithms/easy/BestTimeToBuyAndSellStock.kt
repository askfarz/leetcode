package algorithms.easy

import kotlin.math.max

class BestTimeToBuyAndSellStock {

    // [7,1,5,3,6,4] -> 5
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var idxBuy = 0
        var idxSell = 0
        while (idxSell != prices.size) {
            val currentProfit = prices[idxSell] - prices[idxBuy]
            if (currentProfit > profit) {
                profit = currentProfit
            }

            if (prices[idxSell] < prices[idxBuy]) {
                idxBuy = idxSell
                idxSell++
            } else {
                idxSell++
            }
        }
        return profit
    }

    fun maxProfit1(prices: IntArray): Int {
        var profit = 0

        var lowest = prices[0]
        for (price in prices) {
            if (price < lowest) {
                lowest = price
            }
            profit = max(profit, price - lowest)
        }
        return profit
    }
}
