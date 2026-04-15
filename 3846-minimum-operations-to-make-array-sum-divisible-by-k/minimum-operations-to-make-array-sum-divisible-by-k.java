class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        while(Arrays.stream(nums).sum()%k != 0){
            nums[nums.length-1] = nums[nums.length-1] - 1;
            count++;
        }
        return count;
    }
}