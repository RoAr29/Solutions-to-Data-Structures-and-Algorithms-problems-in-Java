class Solution {
    public int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;

        int i = 0, j = nums.length-1;

        if(nums.length == 1) return 0;

        while(i<=j){
            if(i == 0){
                if(nums[i] > nums[i+1]){
                    return i;
                }
            }
            if(j == nums.length-1){
                if(nums[j] > nums[j-1]){
                    return j;
                }
            }

            else if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
            else if(nums[j] > nums[j-1] && nums[j] > nums[j+1]){
                return j;
            }
            i++;
            j--;
        }
        return -1;
    }
}