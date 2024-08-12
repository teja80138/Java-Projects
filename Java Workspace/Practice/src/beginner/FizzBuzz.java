package beginner;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int x = scanner.nextInt();
		FizzBuzz(x);
		
	}
	
	public static void FizzBuzz(int num) {
		String ans = "";
		if (num%3 ==0 && num%5 == 0) {
			ans+="FizzBuzz";
		}
		else if (num%3 == 0) {
			ans+="Fizz";
			
		}
		else if (num%5 == 0) {
			ans+="Buzz";
		}
		
		
		else {
			ans = Integer.toString(num);
		}
		System.out.println(ans);
	}
	
}
