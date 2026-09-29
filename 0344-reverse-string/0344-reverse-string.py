class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        i = 0
        self.rev(s,i)
    def rev(self , s , i):
        l = len(s)
        j = l-i-1
        if(i == l//2) :
             return
        temp = s[i]
        s[i]=s[j]
        s[j]=temp

        self.rev(s , i+1) 