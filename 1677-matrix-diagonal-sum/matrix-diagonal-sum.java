class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int rows = mat.length;
        
        for(int i=0; i<rows; i++){
            sum += mat[i][i];
            if(i!=rows-1-i){
                sum += mat[i][rows-1-i];
            }
        }
        return sum;
    }
}