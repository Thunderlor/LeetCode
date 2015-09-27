/** Title:Perfect Squares
 * Given a positive integer n, find the least number of perfect square numbers 
 * (for example, 1, 4, 9, 16, ...) which sum to n.
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4;
 * given n = 13, return 2 because 13 = 4 + 9.
 */
 
 
 
//-----------------------------------------
public class Solution {
    /* 思路一：迭代求取目标数所含最大的Pefect Square Number */
    public int numSquares(int n) {
        int temp = (int) Math.sqrt(n);
        int result = n - temp * temp;
        if (result == 0) {
            return 1;
        } else if (isSquareNum(result)) {
            return 2;
        } else {
            return numSquares(result) + 1;
        }
    }
    private boolean isSquareNum(int n) {
        int temp = (int) Math.sqrt(n);
        return (temp * temp == n) ? true : false;
    }
    /* 错误：并不是the least number！*/
}
//-----------------------------------------
