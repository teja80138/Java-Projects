package TicTacToe;
import java.util.*;
public class Player {
	private String name = "";
	private String sym = "";
	public Player(String name, String sym) {
		this.name = name;
		this.sym = sym;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSymbol() {
		return this.sym;
	}
	
	
	public void turn(Board b){
		
		boolean turn = true;
		int r = 0;
		int c = 0;
		while (turn) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\n"+this.name+"\n");
			System.out.print("Enter row: ");
			r = scan.nextInt();
			System.out.print("Enter column: ");
			c = scan.nextInt();
			System.out.println();
			
			if (b.getBoard()[r][c].equals(" ")) {
				if (r>=0 && r<=2) {
					if (c>=0 && c<=2 ) {
						turn = false;
					}
				}
				
				else {
					System.out.println("Oops, please try again!");
				}
			}
			else {
				System.out.println("Oops, please try again!");
			}

		}
		
		

		
		
		b.updateBoard(r, c, sym);
		System.out.println();
		b.showBoard();
		
		
	}
	
}
