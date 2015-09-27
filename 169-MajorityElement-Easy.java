/** Title: Majority Element
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

/* 自我评价：A */
public class Solution {
    /* 思路：简单,既然过半,则排序后选数组[n / 2]的值恰好为Majority Element */
    /* 备注：一开始以为需要自己写排序算法,还翻了一翻书,后来突然记起来Arrays.sort()方法, 基础知识不够牢 */
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[n / 2];
    }
}
