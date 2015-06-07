import java.util.*;

public class Solution {
    boolean[][] vis;
    final int[][] dir = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    public boolean exist(char[][] board, String word) {
        vis = new boolean[board.length][board[0].length];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean dfs(char[][] board, int x, int y, String word, int pos) {
        vis[x][y] = true;
        if (board[x][y] == word.charAt(pos)) {
            if (pos == word.length()-1) return true;
            for (int i=0; i<4; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                if (nx>=0 && nx<board.length && ny>=0 && ny<board[0].length && !vis[nx][ny]) {
                    if (dfs(board, nx, ny, word, pos+1)) {
                        return true;
                    }
                }
            }
        }
        vis[x][y] = false;
        return false;
    }
}