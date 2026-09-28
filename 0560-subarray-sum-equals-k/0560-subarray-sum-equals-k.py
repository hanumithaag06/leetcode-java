class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum = 0
        count = 0
        dict = {}
        dict[0]=1
        for i in range(len(nums)):
            sum += nums[i]
            if sum-k in dict:
                count += dict[sum-k]
            dict[sum] = dict.get(sum,0)+1
        return count
            
        
        