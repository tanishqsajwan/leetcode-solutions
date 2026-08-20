class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr_1 = new int[nums.length];
        int[] arr_2 = new int[nums.length];
        arr_1[0]=nums[0];
        arr_2[0]=nums[1];
        int j=0 ;
        int k = 0;
        for(int i= 2 ; i < nums.length ; i++){
            if(arr_1[j]>arr_2[k]){
           arr_1[j+1]=nums[i];
           j++;
        }
        else{
            arr_2[k+1]=nums[i];
            k++;
        }
    }
    int[] result = new int[nums.length];
int index = 0;

for(int i = 0; i <= j; i++){
    result[index++] = arr_1[i];
}

for(int i = 0; i <= k; i++){
    result[index++] = arr_2[i];
}

return result;
}
}