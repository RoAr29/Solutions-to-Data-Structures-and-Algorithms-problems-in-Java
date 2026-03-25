class Solution {
    public void rotate(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                res[j][i] = matrix[i][j];
            }
        }
         for(int i=0; i<res.length; i++){
            int left = 0;
            int right = res[0].length-1;

            while(left<right){
                int temp = res[i][left];
                res[i][left] = res[i][right];
                res[i][right] = temp;

                left++;
                right--;
            }
        }
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}