class Solution:
    def arraySign(self, nums: list[int]) -> int:
        count = 0 
        for i in range(len(nums)):
            if nums[i] == 0 :
                return 0
            elif nums[i] < 0:
                count += 1
        
        return 1 if count%2==0 else -1