public class Solution {
    public void solve(char[][] board) {
        if (board.length == 0) return;
        int m = board.length, n = board[0].length;
        for (int i=0; i<m; i++) {
            bfs(board, i, 0);
            bfs(board, i, n-1);
        }
        for (int i=0; i<n; i++) {
            bfs(board, 0, i);
            bfs(board, m-1, i);
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    public void bfs(char[][] board, int startX, int startY) {
        final int[][] dir = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[][] vis = new boolean[board.length][board[0].length];
        if (board[startX][startY] != 'O') return;
        queue.add(startX);
        queue.add(startY);
        vis[startX][startY] = true;
        board[startX][startY] = 'Y';
        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();
            for (int i=0; i<4; i++) {
                int tx = x + dir[i][0];
                int ty = y + dir[i][1];
                if (tx>=0 && tx<board.length && ty>=0 && ty<board[0].length 
                    && !vis[tx][ty] && board[tx][ty]=='O') {
                    queue.add(tx);
                    queue.add(ty);
                    vis[tx][ty] = true;
                    board[tx][ty] = 'Y';
                }
            }
        }
    }
}
