class Solution {
    public int fib(int n) {
        int curri = 0;
        int prev = 1;
        int prev2 = 0;

        if(n == 1 || n == 0){
            return n;
        }
        for(int i=2; i<=n; i++){
            curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return curri;
    }
}