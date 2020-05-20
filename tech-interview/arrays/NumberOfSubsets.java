import java.util.Arrays;

/*
 * 
 * Problem Description :
 * 		For a given list of integers and integer K, find the number of non-empty subsets S such that min(S) + max(S) <= K.
 * 
 * Example:
 * 		nums = [2, 4, 5, 7]
 *		k = 8
 *		Output: 5
 *		Explanation: [2], [4], [2, 4], [2, 4, 5], [2, 5]
 * 
 * Algorithm:
 * 
 *   1. Sort the array
 *   2. Check if arr[low] + arr[high] >= k
 *   	2.1 If Yes, then decrement the high.
 *      2.2 If No, then add 1<<(high-low) to Count
 *   3. Print count
 * 
 * 
 *   Time Complexity : 0(nlogn)
 *   Space Complexity : 0(1)
 * 
 */

public class NumberOfSubsets {

	public static void main(String[] args) {
		
		int num[] = new int[] {2,4,5,7};
		int k = 8;
		printTotalSubsets(num, k);

	}

	private static void printTotalSubsets(int[] num, int k) {
		
		// Sort the Array
		Arrays.sort(num);
		
		int count = 0;
		
		for( int low =0, high=num.length-1; low<=high;) {
			if (num[low] + num[high] > k) {
				high --;
			}
			else {
				count += 1 << (high-low);
				low ++;
			}
		}
		System.out.println(count);
	}

}
