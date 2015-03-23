import java.util.*;

public class Solution {
    public void rotate(int[][] matrix) {
        // make mirror along diagonal line
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length-i; j++) {
                int tmp = matrix[i][j];
                int m = matrix.length-i-1, n = matrix[i].length-j-1;
                matrix[i][j] = matrix[n][m];
                matrix[n][m] = tmp;
            }
        }

        // make mirror along horizontal symmetry axis
        for (int i=0; i<matrix.length/2; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                int tmp = matrix[i][j];
                int m = matrix.length - i - 1;
                matrix[i][j] = matrix[m][j];
                matrix[m][j] = tmp;
            }
        }
    }
}
