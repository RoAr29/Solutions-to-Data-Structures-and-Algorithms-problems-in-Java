class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] num = new int[n+1];
        int low = 0, high = n;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'I'){
                num[i] = low;
                low++;
            }
            else{
                num[i] = high;
                high--;
            }
        }
        num[n] = low;
        return num;
    }
}