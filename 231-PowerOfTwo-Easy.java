/** Title:Power Of Two
 * Given an integer, write a function to determine if it is a power of two.
 */


/* 自我评价：C */
public class Solution {
	/* 思路一：首先判断负数为false, 再判定n = 1和n = 2为true
	 * 然后通过对n用2取余来判定isPowerOfTwo直到n == 2时停止
	 */
     public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1 || n == 2) {
            return true;
        } 
        do {
	        if (n % 2 == 1) {
	        	return false;
	        } else {
	        	n = n / 2;
	        }
        } while (n != 2);
        return true;
    }
}
