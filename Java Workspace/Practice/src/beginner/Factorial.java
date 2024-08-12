package beginner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(Factorial(4));
	}
	
	public static int Factorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*Factorial(n-1);
		}
		
		
	}
}
