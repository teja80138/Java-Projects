package TicTacToe;

public class Board {
	private String[][] arr = {
			{" "," "," "},
			{" "," "," "},
			{" "," "," "}
	};
	
	public  void updateBoard( int row, int col, String sym) {
		arr[row][col] = sym;
	}
	
	public  void showBoard() {

		for (int i = 0; i<arr.length;i++) {
			for (int j = 0; j<arr[i].length;j++) {
				
					System.out.print(arr[i][j]);
					if(j != arr[i].length-1) {
						System.out.print(" | ");
					}
					
			}
			
			if (i!=arr.length-1) {
				System.out.println();
				System.out.println("--+---+--");
			}
			

		}

		
	}

	public String[][] getBoard(){
		return arr;
	}
	
	public String[] getRows() {
		
		String[] str = {"","",""};
		for (int i = 0 ; i <arr.length;i++) {
			for (int j = 0; j<arr.length;j++) {
				str[i]+=arr[i][j] +" ";
			}
		}
		
		return str;
	}
	
	public static void showInstructions() {
		System.out.println("    0   1   2");
		System.out.println(" 0    |   |   ");
		System.out.println("   ---+---+---");
		System.out.println(" 1    |   |   ");
		System.out.println("   ---+---+---");
		System.out.println(" 2    |   |   ");
		
	}
	
}
