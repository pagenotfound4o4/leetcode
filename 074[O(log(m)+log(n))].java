import java.util.*;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n;
        while (r > l) {
            int mid = (l + r) >> 1;
            int tx = mid / n, ty = mid % n;
            if (matrix[tx][ty] == target) return true;
            else if (matrix[tx][ty] < target) l = mid + 1;
            else r = mid;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.test();
    }

    public void test() {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,50}}, 3));
    }
}
