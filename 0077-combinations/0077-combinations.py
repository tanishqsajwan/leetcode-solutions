class Solution:
    def combine(self, n: int, k: int) -> list[list[int]]:
        curr=[]
        ans=[]
        self.backtrack(1,n,k,curr,ans)
        return ans
    def backtrack(self , index: int , n: int, k: int , curr :list[int] , ans:list[list[int]]):
        if len(curr) == k :
            ans.append(curr.copy())
            return
        
        for i in range(index ,n+1):
            curr.append(i)

            self.backtrack(i+1 , n ,k ,curr,ans)

            curr.pop(len(curr) - 1)
