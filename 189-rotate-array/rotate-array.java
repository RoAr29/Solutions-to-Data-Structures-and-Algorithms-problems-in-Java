class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;

        int[] arr = new int[nums.length];
        int ind = 0;

        for(int i=nums.length - k; i<nums.length; i++){
            arr[ind++] = nums[i];
        }

        for(int i=0; i<nums.length-k; i++){
            arr[ind++] = nums[i];
        }

        for(int i=0; i<arr.length; i++){
            nums[i] = arr[i];
        }
    }
}