class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []

        def backtrack(temp, start):
            ans.append(temp.copy())

            for i in range(start, len(nums)):
                temp.append(nums[i])

                backtrack(temp, i + 1)

                temp.pop()

        backtrack([], 0)
        return ans