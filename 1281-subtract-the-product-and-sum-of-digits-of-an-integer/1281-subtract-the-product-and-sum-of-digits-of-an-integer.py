class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        a = 1
        b = 0
        while n != 0 :
            k = n % 10
            a *= k
            b += k
            n = n // 10
        
        return a-b