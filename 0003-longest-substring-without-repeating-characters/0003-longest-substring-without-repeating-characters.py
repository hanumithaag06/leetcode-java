class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        cset = set()
        maxlen = 0
        left = 0
        for right in range(len(s)):
            c = s[right]
            while c in cset:
                cset.remove(s[left])
                left+=1
            cset.add(c)
            maxlen = max(maxlen,right-left+1)
        return maxlen
        