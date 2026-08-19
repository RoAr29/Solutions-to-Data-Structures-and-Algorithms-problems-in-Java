class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        //if(nums.length==1 && target == nums[0]) return 0;

        while(low <= high){
            int mid = (low + high)/2;

            if(target < nums[mid]){
                high = mid -1;
            }
            else if(target == nums[mid]){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}