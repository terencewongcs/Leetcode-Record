/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < words.length; i++) {
            if(words[i].equals(word1)) {
                int count = 0;
                for(int j = i-1, k = i+1 ; j >= 0 || k < words.length ; j--, k++) {
                    count++;
                    if((j >=0 &&words[j].equals(word2)) || (k < words.length && words[k].equals(word2))) {
                        if(min > count) min = count;
                        break;
                    }
                }
            }
        }
        return min;
    }
}
// @lc code=end