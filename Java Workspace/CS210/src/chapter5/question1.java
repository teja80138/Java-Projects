package chapter5;
import java.util.*;
public class question1 {

	
	public static void main(String[] args) {
		boolean f = true;
		Random rand = new Random();
		int temp =0;
//		while(f) {
//			int x = rand.nextInt(6)+1;
//			int y = rand.nextInt(6)+1;
//			
//			System.out.println(x+" + "+y+" = "+(x+y));
//			temp++;
//			if ((x+y)==7) {
//				System.out.println("won after "+temp+" tries!");
//				f = false;
//			}
//		}
		int sum = 0;
		
		do {
			int x = rand.nextInt(6)+1;
			int y = rand.nextInt(6)+1;
			sum = x+y;
			System.out.println(x+" + "+y+" = "+(x+y));
			temp++;
		}while (sum!=7) ;
		System.out.println("You won in "+temp+" tries!");
	}
	
}
