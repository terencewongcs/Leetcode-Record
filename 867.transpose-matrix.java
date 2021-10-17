/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        int column = matrix.length;
        int row = matrix[0].length;
        int colcount = 0;
        int[][] result = new int[row][column];
        for(int[] i : matrix){
            for(int j =0;j<i.length;j++){
                result[j][colcount] = i[j];
                }
            colcount++;
        }
        return result;
    }
}
// @lc code=end

