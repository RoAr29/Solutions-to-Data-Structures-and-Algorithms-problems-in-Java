class Solution {
    public int pivotIndex(int[] nums) {

        //System.gc();

        int total = 0;
        int left = 0, right = 0;

        for(int i : nums){
            total += i;
        }

        for(int i=0; i<nums.length; i++){
            
            right = total - left-nums[i];

            if(left == right){
                return i;
            }

            left += nums[i];
        }
        return -1;
    }
}