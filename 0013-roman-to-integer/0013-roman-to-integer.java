class Solution {
    public int romanToInt(String s) {
    Map<Character , Integer> numbers = new HashMap<>();
    numbers.put('I',1);
    numbers.put('V',5);
    numbers.put('X',10);
    numbers.put('L',50);
    numbers.put('C',100);
    numbers.put('D',500);
    numbers.put('M',1000);
    int ans= 0 ;
    for(int i = 0 ; i < s.length() ; i++){
     if(i+1<s.length()){
       if(s.charAt(i)=='I'&&s.charAt(i+1)=='V'){
        ans+= 4 ;
        i++;
        continue;
       }
       
       else if(s.charAt(i)=='I'&&s.charAt(i+1)=='X'){
        ans+= 9 ;
        i++;
        continue;
       }
        
        else if(s.charAt(i)=='X'&&s.charAt(i+1)=='L'){
        ans+= 40 ;
        i++;
        continue;
       }

        else if(s.charAt(i)=='X'&&s.charAt(i+1)=='C'){
        ans+= 90 ;
        i++;
        continue;
       }

        else if(s.charAt(i)=='C'&&s.charAt(i+1)=='D'){
        ans+= 400 ;
        i++;
        continue;
       }

        else if(s.charAt(i)=='C'&&s.charAt(i+1)=='M'){
        ans+= 900 ;
        i++;
        continue;
       }
     }
    
       ans+= numbers.get(s.charAt(i));
       } 
    return ans;             
    }
}