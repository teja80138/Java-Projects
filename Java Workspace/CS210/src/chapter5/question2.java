package chapter5;
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many days' temperatures? ");
		int days = scan.nextInt();
		System.out.println();
		double [] arr = new double[days];
		double sum = 0;
		
		for (int i = 1; i<=7;i++) {
			System.out.print("Day "+i+"'s high temp: ");
			
			double d = scan.nextDouble();
			System.out.print("\n");
			arr[i-1]=d;
			sum+=d;
		}
		double avg = sum/days;
		System.out.println("Average temp: "+ Math.round(avg*10)/10.0);
		
		int count = 0;
		
		for (int x = 0; x<arr.length;x++) {
			if (arr[x]>avg) {
				count++;
			}
		}
		System.out.println(count+" days were above average.");

	}
	
}
