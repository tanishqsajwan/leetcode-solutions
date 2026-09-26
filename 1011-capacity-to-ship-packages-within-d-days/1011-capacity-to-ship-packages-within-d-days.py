class Solution:
    def shipWithinDays(self, weights: list[int], days: int) -> int:
        min_cap = max(weights)
        max_cap = sum(weights)

        while min_cap < max_cap:
            mid = min_cap + (max_cap - min_cap) // 2

            d = 1
            s = 0
            for w in weights:
                if s + w > mid:
                    d += 1
                    s = 0
                s += w

            if d > days:
                min_cap = mid + 1
            else:
                max_cap = mid

        return min_cap   