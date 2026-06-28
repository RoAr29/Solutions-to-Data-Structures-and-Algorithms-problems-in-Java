class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int[] mv = nums;
        nums = mv;

        long NEG_INF = Long.MIN_VALUE / 2;

        long normal    = NEG_INF;
        long mulActive = NEG_INF;
        long divActive = NEG_INF;
        long afterMul  = NEG_INF;
        long afterDiv  = NEG_INF;
        long ans       = NEG_INF;

        for (int x : nums) {
            long mx = (long) x * k;
            long dx = (x >= 0) ? (x / k) : (long) Math.ceil((double) x / k);

            long newAfterMul  = Math.max(afterMul + x,  mulActive + x);
            long newAfterDiv  = Math.max(afterDiv + x,  divActive + x);
            long newMulActive = Math.max(Math.max(mulActive + mx, normal + mx), mx);
            long newDivActive = Math.max(Math.max(divActive + dx, normal + dx), dx);
            long newNormal    = Math.max(normal + x, x);

            normal    = newNormal;
            mulActive = newMulActive;
            divActive = newDivActive;
            afterMul  = newAfterMul;
            afterDiv  = newAfterDiv;

            ans = Math.max(ans, Math.max(normal,
                       Math.max(mulActive,
                       Math.max(divActive,
                       Math.max(afterMul, afterDiv)))));
        }

        return ans;
    }
}