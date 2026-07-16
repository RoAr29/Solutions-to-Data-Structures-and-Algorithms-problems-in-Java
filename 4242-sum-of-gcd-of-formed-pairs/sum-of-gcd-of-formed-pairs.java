class Solution {
    public long gcdSum(int[] nums) {
        int[] prefix = new int[nums.length];
        int mx = 0;

        for(int i=0; i<nums.length; i++){
             mx = Math.max(mx, nums[i]);
            prefix[i] = gcd(nums[i], mx);
        }

        Arrays.sort(prefix);
        long sum=0;
        int left = 0, right = nums.length-1;

        while(left<right){
            sum += gcd(prefix[left], prefix[right]);
            left++;
            right--;
        }
        return sum;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}