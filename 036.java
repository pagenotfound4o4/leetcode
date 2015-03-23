import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRowsAndCols(board) && checkBlocks(board);
    }

    public boolean checkRowsAndCols(char[][] board) {
        for (int i=0; i<9; i++) {
            boolean[] flagRow = new boolean[10];
            boolean[] flagCol = new boolean[10];
            for (int j=0; j<9; j++) {
                if (board[i][j] != '.') {
                    if (flagRow[board[i][j] - '0'])
                        return false;
                    else
                        flagRow[board[i][j] - '0'] = true;
                }
                if (board[j][i] != '.') {
                    if (flagCol[board[j][i] - '0'])
                        return false;
                    else
                        flagCol[board[j][i] - '0'] = true;
                }
            }
        }
        return true;
    }

    public boolean checkBlocks(char[][] board) {
        for (int t=0; t<9; t++) {
            int shiftX = t / 3 * 3, shiftY = t % 3 * 3;
            boolean[] flag = new boolean[10];
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    int x = shiftX + i, y = shiftY + j;
                    if (board[x][y] != '.') {
                        if (flag[board[x][y] - '0'])
                            return false;
                        else
                            flag[board[x][y] - '0'] = true;
                    }
                }
            }
        }
        return true;
    }
}
