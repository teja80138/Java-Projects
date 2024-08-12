package beginner;

public class PowerOf {
	public static void main(String[] args) {
		int j = PowerOf(11,4);
		System.out.println(j);
	}
	public static int PowerOf(int num, int x) {
		if (x == 0) {
			return 1;
		}
		else {
			return num * PowerOf(num,x-1);
		}
	}
}
