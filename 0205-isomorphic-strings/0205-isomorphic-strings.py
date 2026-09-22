class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        i={}
        k={}

        for j in range(len(s)):
            si = s[j]
            ti = t[j]

            if si in i:
                if i[si]!=ti:
                    return False

            elif ti in k:
                if k[ti]!=si:
                    return False

            else:
                i[si]=ti
                k[ti]=si
        
        return True