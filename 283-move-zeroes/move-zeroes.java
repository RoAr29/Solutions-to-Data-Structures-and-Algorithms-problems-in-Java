class Solution {
    public void moveZeroes(int[] nums) {
        int[] num = new int[nums.length];
        int ind = 0;
        for(int i:nums){
            if(i!=0){
                num[ind++] = i;
            }
        }
        for(int i=ind; i<num.length; i++){
            num[ind++] = 0;
        }
        ind = 0;
        for(int i:num){
            nums[ind++] = i;
        }
    }
}