import java.util.*;

public class Solution {
    private int cnt = 0;

    public int totalNQueens(int n) {
        int[] rows = new int[n];
        cnt = 0;
        dfs(rows, 0);
        return cnt;
    }

    public void dfs(int[] rows, int pos) {
        // find the solution
        if (pos == rows.length) {
            cnt++;
            return;
        }
        for (int i=0; i<rows.length; i++) {
            if (judge(rows, pos, i)) {
                rows[pos] = i;
                dfs(rows, pos + 1);
                rows[pos] = 0;
            }
        }
    }

    public boolean judge(int[] rows, int pos, int x) {
        for (int i=0; i<pos; i++) {
            if (rows[i] == x) return false;
            if (Math.abs(pos - i) == Math.abs(x - rows[i])) return false;
        }
        return true;
    }
}
