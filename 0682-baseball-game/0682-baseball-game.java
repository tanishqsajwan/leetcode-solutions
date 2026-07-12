class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(String a : operations){
            if(a.equals("C")) ans.remove(ans.size()-1);
            else if(a.equals("D")) ans.add(ans.get(ans.size()-1)*2);
            else if(a.equals("+")) ans.add(ans.get(ans.size()-1)+ans.get(ans.size()-2));
            else{ ans.add(Integer.parseInt(a));}
        }
        int sum=0;
        for(int a: ans){
            sum += a;
        }
        return sum;
    } 
}