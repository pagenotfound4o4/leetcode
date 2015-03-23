import java.util.*;

public class Solution {
    public String convert(String s, int nRows) {
        int blockSize = 2 * nRows - 2;
        if (nRows <= 2) blockSize = nRows;
        int len = s.length() / blockSize * 2 + 2;
        char[][] zig = new char[nRows][len];
        for (int pos=0; pos< s.length(); pos++) {
            int x = pos % blockSize;
            int y = pos / blockSize * 2;
            if (x >= nRows) {
                x = x - (x - nRows + 1) * 2;
                y++;
            }
            zig[x][y] = s.charAt(pos);
        }
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<nRows; i++) {
            for (int j=0; j<len; j++) {
                if (zig[i][j] != 0) {
                    sb.append(zig[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
