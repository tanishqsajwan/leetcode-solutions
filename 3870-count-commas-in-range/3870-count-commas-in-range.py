class Solution:
    def countCommas(self, n: int) -> int:
        return(0 if n<1000 else (n-1000)+1)