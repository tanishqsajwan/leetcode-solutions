# sloved using recurssion/Iteration approach

# Code


```python []
#recursive approach
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

```
```java []
//recursive approach
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        reverse(s, i);
    }
    static void reverse(char[] s , int i){
        int l = s.length;
        int j = l-i-1;
        if(i == l/2) return ;
            char temp = s[i];
            s[i]=s[j];
            s[j] = temp;
        reverse(s , i+1);
    }
}
```

```java []
//using iterative approach
class Solution {
    public void reverseString(char[] s) {
        int i = s.length - 1; 

        for(int j= 0 ; j< s.length ;j++){
            if(j!=i){
                if(j>i) break;
                char k = s[j];
                s[j]=s[i];
                s[i]=k;
                i--;
            }
        }
    }
}
```
```python []
class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        s.reverse()
```