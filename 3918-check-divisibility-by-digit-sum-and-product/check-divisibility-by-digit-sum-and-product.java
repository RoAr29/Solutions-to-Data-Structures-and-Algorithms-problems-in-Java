class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int num = 0;
        int s = n;

        while(n!=0){
            num = n%10;
            sum+=num;
            prod*=num;
            n/=10;
        }

        if(s%(sum+prod) == 0) return true;

        return false;
    }
}