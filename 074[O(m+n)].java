import java.util.*;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0, y = 0;
        int m = matrix.length, n = matrix[0].length;
        while (x<m && y<n) {
            if (matrix[x][y] == target) return true;
            if (x+1<m && matrix[x+1][y] <= target) x++;
            else if (y+1<n && matrix[x][y+1] <= target) y++;
            else break;
        }
        return false;
    }
}
