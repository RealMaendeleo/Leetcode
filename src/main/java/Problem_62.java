import java.util.Arrays;

/**
 * There is a robot on an m x n grid.
 * The robot is initially located at the top-left corner.
 * The robot tries to move to the bottom-right corner.
 * The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths
 * that the robot can take to reach the bottom-right corner.
 */

public class Problem_62 {
    public static int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        Arrays.fill(matrix[0], 1);

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }
        return matrix[m-1][n-1];
    }
}
