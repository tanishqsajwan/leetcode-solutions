class Solution:

    def searchRange(self, nums, target):
        left = self.leftbond(nums, target)
        right = self.rightbond(nums, target)

        return [left, right]

    def leftbond(self, nums, target):
        index = -1
        low = 0
        high = len(nums) - 1

        while low <= high:
            mid = low + (high - low) // 2

            if nums[mid] == target:
                index = mid
                high = mid - 1

            elif nums[mid] < target:
                low = mid + 1

            else:
                high = mid - 1

        return index

    def rightbond(self, nums, target):
        index = -1
        low = 0
        high = len(nums) - 1

        while low <= high:
            mid = low + (high - low) // 2

            if nums[mid] == target:
                index = mid
                low = mid + 1

            elif nums[mid] < target:
                low = mid + 1

            else:
                high = mid - 1

        return index