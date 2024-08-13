package Arrays;

//566.Reshape the Matrix

public class Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length * mat[0].length;
        if(r*c != n){
            return mat;
        }
        int[][] ans = new int[r][c];
        int tempR = 0;
        int tempC = 0;
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[i].length;j++){
                ans[tempR][tempC] = mat[i][j];
                if(tempC == c - 1){
                    tempR++;
                    tempC = 0;
                }
                else{
                    tempC++;
                }
            }
        }

        return ans;
    }
}
