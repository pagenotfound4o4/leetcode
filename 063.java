import java.util.*;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        for (int i=0; i<obstacleGrid.length; i++) {
            for (int j=0; j<obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1;
                } else {
                    if (i > 0) {
                        obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                    }
                    if (j > 0) {
                        obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                    }
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}
