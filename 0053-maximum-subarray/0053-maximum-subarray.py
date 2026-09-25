class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        maxSum = nums[0]
        currSum = 0
        for i in range(len(nums)):
            currSum = max(nums[i],currSum+nums[i])
            maxSum = max(maxSum, currSum)
        return maxSum
        
        