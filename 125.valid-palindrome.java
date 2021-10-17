/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(Character.isLetter(leftChar) || Character.isDigit(leftChar)) {
                if(Character.isLetter(rightChar) || Character.isDigit(rightChar)) {
                    if(leftChar != rightChar) return false;
                    else {
                        left++;
                        right--;
                    }
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return true;
    }
}
// @lc code=end

