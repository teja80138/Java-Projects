package Intermediate;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11};
		int x = findMissingNumber(arr);
		System.out.println(x);
	}
	
	public static int findMissingNumber(int[] arr) {
		int ans = 0;
		for (int i = 0; i<arr.length-1; i++) {
			if (arr[i+1]!=(arr[i]+1)) {
				ans = arr[i]+1;
			}
		}
		return ans;
	}
}
