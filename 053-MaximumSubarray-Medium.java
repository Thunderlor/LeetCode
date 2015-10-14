/* Find the contiguous subarray within an array 
 * (containing at least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * More practice:
 * If you have figured out the O(n) solution, try coding another 
 * solution using the divide and conquer approach, which is more subtle.
 */
 
/* 思路一：由于刚刚看过Introduction To Algorithms, 因此选择按照提示来做
 * 使用Divide-and-conquer来求解
 */
public class solution {
	public int maxSubArray(int nums[]) {
		return (nums.length == 0) ? 0 : findMaximumSubArray(nums[], 0, nums.length);
	}
	private int findMaximumSubArray(int nums[], int low, int high) {
		if (low == high) return nums[low];
		int mid = (low + high) / 2;
		int leftMax = findMaximumSubArray(nums, low, mid);
		int rightMax = findMaximumSubArray(nums, mid + 1, high);
		int crossMax = findCrossMaximumSubArray(nums, low, mid);
		if (leftMax >= rightMax && leftMax >= crossMax) {
			return leftMax;
		} else if (rightMax >= crossMax) {
			return rightMax;
		} else {
			return crossMax;
		}
	}
	private int findCrossMaximumSubArray(int nums[], int low, int high) {
	
	}
}
