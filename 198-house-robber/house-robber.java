class Solution {

    public int rob(int[] nums) {

        int prev = 0;
        int prev2 = 0;

        for(int i = nums.length - 1; i >= 0; i--) {

            int curr = Math.max(nums[i] + prev2, prev);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}