class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        maxSum = nums[0]
        sum = 0
        for i in range(len(nums)):
            if sum<0:
                sum=0
            sum += nums[i]
            maxSum = max(sum,maxSum)
        return maxSum
        
        