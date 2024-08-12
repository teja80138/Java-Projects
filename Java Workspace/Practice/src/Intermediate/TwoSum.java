package Intermediate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] ans = TwoSum(4,arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] TwoSum(int num,int[] arr) {
		int[] ans = new int[2];
		for ( int i = 0; i<arr.length;i++ ) {
			for ( int j = i+1; j<arr.length;j++) {
				if(arr[i]+arr[j] == num) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
	}
}
