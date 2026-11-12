class Solution:
    def combinationSum3(self, k: int, n: int) -> list[list[int]]:
        curr=[]
        ans=[]
        self.backtrack(1 ,0 ,ans, curr , k  , n)
        return ans
    def backtrack(self, index:int , sum :int ,ans:list[list[int]] ,curr:list[int] , k: int, n: int):
        if sum > n:
            return
        if len(curr) == k:
            if sum == n:
                ans.append(curr.copy())
            return

        for i in range(index , 10):
            curr.append(i)
            self.backtrack(i+1 , sum+i , ans,curr , k , n)
            curr.pop(len(curr) - 1)