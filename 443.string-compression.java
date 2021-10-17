/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        int cur = 0;
        int count = 1;
        int i;
        for(i = 0; i< chars.length; i++) {
            
            if(i+1<chars.length && chars[i] == chars[i+1]) {
                count++;
            } else if(count>1){
                chars[cur++] = chars[i];
                if(count>9) {
                    String countStr = String.valueOf(count);
                    for(char c : countStr.toCharArray())
                        chars[cur++] = c;
                } else 
                    chars[cur++] = Character.forDigit(count, 10);
                
                count = 1;
            } else {
                chars[cur++] = chars[i];
            }
        }
        
        return cur;
    }
}
// @lc code=end

