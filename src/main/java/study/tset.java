package study;

import java.util.ArrayList;
import java.util.Scanner;

class tset {
    public static void main(String[] args) {
        tset tset = new tset();
        int[][] nums=new int[3][3];
        //tset.uniquePathsWithObstacles(nums);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(nums[i][j]);
            }
        }



    }




    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = obstacleGrid[0][i] == 1 ? 0 : 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : 1;
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }




        return dp[m - 1][n - 1];
    }

    }
