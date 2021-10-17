/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int it1 = num1.length() - 1, it2 = num2.length() - 1;
        int carry = 0;
        int sum=0;
        String res = "";
        while(it1 >= 0 && it2 >= 0){
            int digit1 = num1.charAt(it1) - '0';
            int digit2 = num2.charAt(it2) - '0';
            sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            res = sum + res;
            it1--;
            it2--;
        }
        while(it1 >= 0){
            int digit1 = num1.charAt(it1) - '0';
            sum = digit1 + carry;
            carry = sum / 10;
            sum = sum % 10;
            res = sum + res;
            it1--;
        }
        while(it2 >= 0){
            int digit2 = num2.charAt(it2) - '0';
            sum = digit2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            res = sum + res;
            it2--;
        }
        if(carry == 1)
            res = "1" + res;
        return res;
    }
}
// @lc code=end

