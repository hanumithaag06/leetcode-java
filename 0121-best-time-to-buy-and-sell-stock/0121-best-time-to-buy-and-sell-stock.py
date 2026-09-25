class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        cpidx = 0
        mp = 0
        for i in range(1,len(prices)):
            if prices[cpidx] > prices[i]:
                cpidx = i
            else:
                mp = max(mp, prices[i] - prices[cpidx])
        return mp

        
        