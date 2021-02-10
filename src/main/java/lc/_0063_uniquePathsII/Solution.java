package lc._0063_uniquePathsII;

public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    // System.out.println("i : " + i + " j : " + j + " dp : " + dp[i][j]);
                    continue;
                }

                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
                // System.out.println("i : " + i + " j : " + j + " dp : " + dp[i][j]);

            }
        }
        return dp[m - 1][n - 1];
    }

    // Can use 1-D array to save only [i - 1] [j] and [i][j - 1] data, no need to save all history data
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                    // System.out.println("i : " + i + " j : " + j + " dp : " + dp[i][j]);

                } else if (j > 0) {
                    dp[j] += dp[j - 1];
                }

//                if (i == 0 && j == 0) {
//                    dp[j] = 1;
//                } else if (i == 0) {
//                    dp[j] = dp[j - 1];
//                } else if (j == 0) {
//                    dp[j] = dp[j];
//                } else {
//                    dp[j] = dp[j] + dp[j - 1];
//                }
                 System.out.println("i : " + i + " j : " + j + " dp : " + dp[j]);

            }
        }
        return dp[n - 1];
    }
}
