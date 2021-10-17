/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        
        for(int i = 0;i < s.length();i ++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(map.containsKey(tChar) && map.get(tChar) != sChar) return false;
            if(!map.containsKey(tChar)) {
                if(map.containsValue(sChar)) return false;
                else map.put(tChar, sChar); 
            }
        }
        
        return true;
    }
}
// @lc code=end

