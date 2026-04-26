class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = start + 2 * i;
        }
        int res = 0;
        for(int m:arr){
            res ^= m;
        }
        return res;
    }
}