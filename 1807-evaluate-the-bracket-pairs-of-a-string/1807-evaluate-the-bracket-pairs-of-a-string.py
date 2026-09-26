class Solution:
    def evaluate(self, s: str, knowledge: list[list[str]]) -> str:
        mp = {k: v for k, v in knowledge}

        result = []
        i, n = 0, len(s)

        while i < n:
            if s[i] == '(':
                i += 1
                temp = []
                while i < n and s[i] != ')':
                    temp.append(s[i])
                    i += 1
                key = ''.join(temp)
                result.append(mp.get(key, '?'))
            else:
                result.append(s[i])
            i += 1

        return ''.join(result)