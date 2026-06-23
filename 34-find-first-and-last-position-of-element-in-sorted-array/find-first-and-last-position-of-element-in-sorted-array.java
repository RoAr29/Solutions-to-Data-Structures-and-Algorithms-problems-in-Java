class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1, l = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                if(f == -1){
                    f = i;
                    l = i;
                }
                else{
                    l = i;
                }
            }
        }
        int[] arr = {f,l};
        return arr;
    }
}