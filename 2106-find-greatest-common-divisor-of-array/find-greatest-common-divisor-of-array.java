class Solution {
    public int findGCD(int[] nums) {
        int min = 1000;
        int max = 0;

        for(int i:nums){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return gcd(max, min);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int t = a%b;
            a = b;
            b = t;
        }
        return a;
    }
}