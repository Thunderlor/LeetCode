/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

/* 自我评价：A */
public class Solution {
	/* 思路一：通过将N位数中的(最后一位 + 倒数第二位)
	 * 并移除原N位数最后一位得到新的N - 1位数
	 * 直到结果为个位数
	 */
	public int addDigits(int num) {
		while (num > 9) {
			num = num / 10 + num % 10;
		}
        return num;
    }
}
