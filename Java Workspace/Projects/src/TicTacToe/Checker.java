package TicTacToe;

import java.util.*;

public class Checker {
	public static boolean check(Board b, Player p) {
		
		return (checkRow(b,p) || checkCol(b,p) || checkDiag(b,p));
			
	}
	
	public static boolean checkRow(Board b, Player p) {
		String[] s = b.getRows();
		
		String str = p.getSymbol()+" "+p.getSymbol()+" "+p.getSymbol()+" ";
		
		for (int i = 0; i<s.length;i++) {
			if (s[i].equals(str)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkCol(Board b, Player p) {
		
		String [][] arr = b.getBoard();
		int count =0;
		while (count<3) {
			if (arr[0][count].equals(p.getSymbol()) && arr[1][count].equals(p.getSymbol()) && arr[2][count].equals(p.getSymbol())){
				return true;
			}
			count++;
		}
		
		return false;
	}
	
	public static boolean checkDiag(Board b, Player p) {
		String[][] arr = b.getBoard();
		return((arr[0][0].equals(p.getSymbol()) && arr[1][1].equals(p.getSymbol()) && arr[2][2].equals(p.getSymbol())) 
				|| (arr[0][2].equals(p.getSymbol()) && arr[1][1].equals(p.getSymbol()) && arr[2][0].equals(p.getSymbol()))  );
	}
}
