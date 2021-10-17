/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        //transpose
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++){     //j = i else it will transpose twise
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //replace col
        int colStart = 0, colEnd = c-1;
        while (colStart < colEnd){
            for (int i = 0; i < r; i++)
            {
                int temp = matrix[i][colStart];
                matrix[i][colStart] = matrix[i][colEnd];
                matrix[i][colEnd] = temp;
            }
            colStart++;
            colEnd--;
        }
    }
}
// @lc code=end

