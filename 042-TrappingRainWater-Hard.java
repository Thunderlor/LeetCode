/** Title: Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the 
 * width of each bar is 1, compute how much water it is able to trap after raining. 
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
 
/* 自我评价：B */
public class Solution {
	public int trap(int[] height) {
		int n = height.length;
		if (n == 0) return 0;
		int sum = 0;
		int result = 0;
		for (int i = 0; i < n; i++) { sum += height[i]; }
		int index = 0;
		while (index < n - 1) {
			if (height[index] <= height[index + 1]) {
				result += height[index];
				index++;
				continue;
			} else {
				int max = 0;
				int maxIndex = 0;
				for (int i = index + 1; i < height.length; i++) {
					if (height[i] >= height[index]){
						max = height[index];
						maxIndex = i;
						break;
					} else {
						if (height[i] > max) {
							max = height[i];
							maxIndex = i;
						} else if (height[i] == 0 && maxIndex == 0) {
							maxIndex = i;
							max = 0;
						}
					}
				}
				result = result + height[index] + max * (maxIndex - index - 1);
				index = maxIndex;
			}                
		}
		return result + height[height.length - 1] - sum;
	}
}
