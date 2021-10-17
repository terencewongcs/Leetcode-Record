/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String reverseString = "";
        for(int i = 0; i < words.length;i++){
                if (!words[words.length-1-i].isEmpty()){
                    reverseString += words[words.length-1-i].trim() + " ";
                }
        }
        return reverseString.trim();
    }
}
// @lc code=end

