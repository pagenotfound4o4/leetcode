import java.util.*;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int iflag = 1, jflag = 1;
        // set flags
        for (int i=0; i<matrix.length; i++) {
            if (matrix[i][0] == 0) {
                iflag = 0;
                break;
            }
        }
        for (int j=0; j<matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                jflag = 0;
                break;
            }
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        // set zero
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (iflag == 0) {
            for (int i=0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (jflag == 0) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
