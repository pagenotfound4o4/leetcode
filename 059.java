import java.util.*;

public class Solution {
    public int[][] generateMatrix(int n) {
        final int[][] dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        int[][] arr = new int[n][n];
        int num = 1;
        int x = 0, y = -1, pos = 0;
        while (num <= n*n) {
            int tx = x + dir[pos][0];
            int ty = y + dir[pos][1];
            if (tx>=0 && tx<n && ty>=0 && ty<n && arr[tx][ty]==0) {
                x = tx;
                y = ty;
                arr[x][y] = num++;
            } else {
                pos = (pos + 1) % 4;
            }
        }
        return arr;
    }
}
