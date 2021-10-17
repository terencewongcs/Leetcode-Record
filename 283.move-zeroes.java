/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;  //starts with  the first position
        for (int  currentIndex=0; currentIndex < nums.length; currentIndex++){
            if (nums[currentIndex] != 0){
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[currentIndex];
                nums[currentIndex] = temp;
                nonZeroPointer++; //next time non-zero found, put it next to previous non-zero. Eventually all non-zero will be next to each  other sequentially and all 0 will be pushed to the end  of  array
            }
        }
    }
}
// @lc code=end

