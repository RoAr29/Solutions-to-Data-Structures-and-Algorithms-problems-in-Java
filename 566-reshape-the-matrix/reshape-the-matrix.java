class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int rows = mat.length;
       int cols = mat[0].length;
       int[][] num = new int[r][c];

       if((r*c) != (rows*cols)){
        return mat;
       }
       
       else{
        int i = 0;
        int j = 0;
        for(int m=0; m<rows; m++){
            for(int n=0; n<cols; n++){
                num[i][j] = mat[m][n];
                j++;
                if(j == c){
                    j = 0;
                    i++;
                }
            }
        }
       }
       return num;
    }
}