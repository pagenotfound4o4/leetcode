public class NumMatrix {
    int[][] sum;
    int n, m;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        n = matrix.length;
        m = matrix[0].length;
        sum = new int[n][m];
        sum[0][0] = matrix[0][0];
        for (int i=1; i<n; i++) sum[i][0] = sum[i-1][0] + matrix[i][0];
        for (int i=1; i<m; i++) sum[0][i] = sum[0][i-1] + matrix[0][i];
        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (sum==null | row1<0 || row2>=n || col1<0 || col2>=m) return -1;
        int ret = sum[row2][col2];
        if (row1 > 0) ret -= sum[row1-1][col2];
        if (col1 > 0) ret -= sum[row2][col1-1];
        if (col1>0 && row1>0) ret += sum[row1-1][col1-1];
        return ret;
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
