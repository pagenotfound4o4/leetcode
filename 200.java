import java.util.*;

public class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int cnt = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    dfs(grid, vis, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] grid, boolean[][] vis, int x, int y) {
        final int[][] dir = new int[][] {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        vis[x][y] = true;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(x);
        queue.add(y);
        while (!queue.isEmpty()) {
            int cx = queue.poll();
            int cy = queue.poll();
            for (int i=0; i<4; i++) {
                int tx = cx + dir[i][0];
                int ty = cy + dir[i][1];
                if (tx >= 0 && ty >= 0 && tx < grid.length && ty < grid[0].length) {
                    if (!vis[tx][ty] && grid[tx][ty] == '1') {
                        vis[tx][ty] = true;
                        queue.add(tx);
                        queue.add(ty);
                    }
                }
            }
        }
    }
}
