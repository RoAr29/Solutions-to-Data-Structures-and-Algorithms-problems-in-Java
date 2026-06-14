class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sqsum = 0;
        int num = 0;

        while(n>0){
            num = n%10;
            sum += num;
            sqsum += (num*num);
            n /= 10;
        }
        return (sqsum - sum) >= 50;
    }
}