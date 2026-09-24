class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        smallest_index =sys.maxsize
        for i in range(len(nums)):
            if i == self.sum_of_digit(nums[i]):
                smallest_index = i
                break
        if(smallest_index == sys.maxsize):
                return -1
        return smallest_index
    def sum_of_digit(self,n):
        total = 0
        while n > 0:
            total += n%10
            n //= 10
        return total