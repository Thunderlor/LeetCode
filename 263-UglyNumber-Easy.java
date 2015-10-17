/** Title:UglyNumber
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 */
 
/* 自我评价：C */
public class Solution {
    /* 思路三：尝试添加多判定条件来节省runtime */
    public boolean isUgly(int num) {
        if (num <= 0) { return false; }        
        while (num % 15 == 0) { num /= 15; }
        while (num % 10 == 0) { num /= 10; }
        while (num % 6 == 0) { num /= 6; }
        while (num % 5 == 0) { num /= 5; }
        while (num % 3 == 0) { num /= 3; }
        while (num % 2 == 0) { num /= 2; }
        return num == 1;
    }
    /* Runtime:248ms */
    /* 是否有更好的思路,该方法Runtime跨度太长,说明算法不够优异,有待提高 */
}
 
//------------------------------------
public class Solution {
    /* 思路二：positive numbers!!! 因此0和负数需要排除，否则0会超时 */
    public boolean isUgly(int num) {
    	if (num <= 0) {	return false; }
        while (num % 2 == 0) { num /= 2; }
        while (num % 3 == 0) { num /= 3; }
        while (num % 5 == 0) { num /= 5; }
        return num == 1 ? true : false;
    }
    /* Runtime:偏长 */
}
 
//------------------------------------
public class Solution {
	/* 思路一：将num分别对2, 3, 5取余, 当不存在余数时, 除尽该被除数 */
    public boolean isUgly(int num) {
        while (num % 2 == 0) { num /= 2; }
        while (num % 3 == 0) { num /= 3; }
        while (num % 5 == 0) { num /= 5; }
        return num == 1 ? true : false;
    }
    /* 该方法超时！ */
}
