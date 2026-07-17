class Solution {
    public int climbStairs(int n) {

        int curri = 0;
        int prev = 3;
        int prev2 = 2;

        if(n<=3){
            return n;
        }

        for(int i=4; i<=n; i++){
            curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
}