class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] num = new int[n];
        int index = 0;
        k = k%n;

        for(int i=n-k; i<n; i++){
            num[index++] = nums[i];
        }
        for(int i=0; i<n-k; i++){
            num[index++] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = num[i];
        }
    }
}