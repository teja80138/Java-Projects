package chapter5;

import java.util.Arrays;

public class meow {
	public static void main(String[] args) {
		int h =5;
		int[] a= new int[h];
		for (int i = 2; i<a.length/2;i++) {
			a[i]=	a.length%2;
		}
		for(int j = 0; j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
}
