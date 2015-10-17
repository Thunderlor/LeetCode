/* Title: Valid Parentheses
 * Given a string containing just the characters '(', ')', 
 * '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
 
public class Solution {
	public boolean isValid(String s) {
		int len = s.length();
		if (len % 2 == 1) return false;
		
	}
} 

public class Solution {
	/* 思路一： 一开始我理解错题目的意思，我认为"([])"并不是正确的答案
	 * 所以，有了如下错误解法
 	 */
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }
        int i = 0;
        boolean result = true;
        while (result) {
            result = isCorrectOrder(s.charAt(i), s.charAt(i + 1));
            i += 2;
            if (i == len) break;
        }
        return result;
    }
    
    private boolean isCorrectOrder(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '[' && c2 == ']') return true;
        if (c1 == '{' && c2 == '}') return true;
        return false;
    }
}
