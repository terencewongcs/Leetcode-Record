/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int total = matrix.length * matrix[0].length;
        int count = 0;
        
  
        
        List<Integer> li = new ArrayList<Integer>();
        
        int left = 0;
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        
        int direction = 0;
        
        while(left <= right && top <= bottom){
          if(direction == 0){
            for(int i = left; i<=right; i++){
              li.add(matrix[top][i]);
            }
            top++;
            direction = 1;
          }else if(direction == 1){
            for(int i = top; i<=bottom; i++){
              li.add(matrix[i][right]);
            }
            right--;
            direction = 2;
          }else if(direction == 2){
            for(int i = right; i>=left; i--){
              li.add(matrix[bottom][i]);
            }
            bottom--;
            direction = 3;
          }else if(direction == 3){
            for(int i = bottom; i>=top; i--){
              li.add(matrix[i][left]);
            }
            left++;
            direction = 0;
          }
        }
        
        
        
        //System.out.print(right);
          
        return li;
    }
}
// @lc code=end

