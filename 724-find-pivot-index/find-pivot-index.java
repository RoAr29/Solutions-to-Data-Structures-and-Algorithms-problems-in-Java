class Solution {
    public int pivotIndex(int[] nums) {

        int total = 0;
        int left = 0, right = 0;

        for(int i:nums){
            total += i;
        }

        for(int i=0; i<nums.length; i++){
            right = total - nums[i] - left;
            if(right == left) return i;
            left += nums[i];
        }
        return -1;
    }
}