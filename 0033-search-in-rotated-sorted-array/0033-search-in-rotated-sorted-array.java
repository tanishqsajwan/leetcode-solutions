class Solution {
    public int search(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1;
        while(low <= high ){
            int mid = low+(high-low)/2;
           if (nums[mid] == target) {
    return mid;
}
else if (nums[low] <= nums[mid]) {       // left half sorted

    if (target >= nums[low] && target < nums[mid]) {
        high = mid - 1;                  // target in left
    } else {
        low = mid + 1;                   // target in right
    }

}
else {                                   // right half sorted

    if (target > nums[mid] && target <= nums[high]) {
        low = mid + 1;                   // target in right
    } else {
        high = mid - 1;                  // target in left
    }
}
        
            }
   return -1;
}
}