import java.util.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new LinkedList<Integer>();
        if (matrix == null || matrix.length == 0) return ret;
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (true) {
            // right
            for (int i=left; i<=right; i++) {
                ret.add(matrix[up][i]);
            }
            up++;
            if (up > down) break;
            // down
            for (int i=up; i<=down; i++) {
                ret.add(matrix[i][right]);
            }
            right--;
            if (left > right) break;
            // left
            for (int i=right; i>=left; i--) {
                ret.add(matrix[down][i]);
            }
            down--;
            if (up > down) break;
            // up
            for (int i=down; i>=up; i--) {
                ret.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;
        }
        return ret;
    }
}