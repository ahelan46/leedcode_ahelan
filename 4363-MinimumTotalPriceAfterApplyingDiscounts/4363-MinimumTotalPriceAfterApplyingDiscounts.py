# Last updated: 8/11/2026, 3:58:00 PM
class Solution(object):
    def minPrice(self, prices, discounts):
        """
        :type prices: List[int]
        :type discounts: List[int]
        :rtype: float
        """
        prices.sort(reverse=True)
        discounts.sort(reverse=True)
        total=float(sum(prices))
        for i in range(min(len(prices),len(discounts))):
            total-=prices[i]*discounts[i]/100.0
        return total
        