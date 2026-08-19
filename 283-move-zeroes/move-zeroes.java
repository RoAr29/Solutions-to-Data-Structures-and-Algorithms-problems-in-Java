class Solution {
    public void moveZeroes(int[] nums) {

        int count = 0;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){

            if(nums[i] == 0){
                count++;
            }
        }
        int ind = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                arr[ind++] = nums[i];
            }
        }
        for(int i=0; i<count; i++){
            arr[ind++] = 0;
        }

        for(int i=0; i<arr.length; i++){
            nums[i] = arr[i];
        }
    }
}