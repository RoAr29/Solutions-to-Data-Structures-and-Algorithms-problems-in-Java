class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum = 0;
        int n = nums.length;
        while (k != 0) {
            long val = nums[n - 1];
            totalSum += Math.max(val * mul, val);
            k--;
            mul--;
            n--;
        }

        return totalSum;
    }
}