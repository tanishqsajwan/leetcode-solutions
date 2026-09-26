class Solution:
    def findMin(self, nums: list[int]) -> int:
        low = 0
        high = len(nums) - 1
        ans = sys.maxsize
        while(low <= high):
            mid = low+(high-low)//2
            if(nums[mid] < ans):
                ans = nums[mid]
            
            elif(nums[mid]>nums[high]):
                low=mid+1
            
            else:
                high= mid-1
        
        return ans