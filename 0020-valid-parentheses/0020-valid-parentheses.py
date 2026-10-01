class Solution:
    def isValid(self, s: str) -> bool:
        seen = []
        for i in range(len(s)):
            if s[i]=='(' or s[i] =='{' or s[i]=='[':
                seen.append(s[i])
            else:
                if len(seen) == 0:
                    return False
                if s[i] =='}' and seen[-1]=='{' or s[i] ==']' and seen[-1] =='[' or s[i]==')' and seen[-1]=='(':
                    seen.pop()
                else :
                    return False

        if not seen:
            return True
        return False