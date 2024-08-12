package beginner;

public class drawings {
	public static void main(String[] args) {
		xMasTree(7);
		diamond(7);
		
	}
	
	public static void xMasTree(int rows) {
		String ans = "";
		int space = rows-1;
		int count = 0;
		for (int i = 0; i<rows+1;i++) {
			for(int j = 0; j<space+1;j++) {
				ans+=" ";
			}

			
			for (int k = 0; k<=count;k++) {
				if (i%2 != 0) {
					ans+="+";
				}
				else {
				ans+="*";}
			}
			count+=2;
			space--;
			ans+="\n";
		}
		
		System.out.print(ans);
	}
	
	public static void diamond(int height) {
		int space = height-1;
		int count = 1;
		String ans = "";
		for(int i = 0; i<height/2;i++) {
			
				for (int j = 0;j<space;j++) {
					ans+=" ";
				}
				for (int x = 0;x<count;x++) {
					ans+="*";
							
				}
				count+=2;
				space--;
				ans+="\n";
				
				
			}
		for (int k = height/2;k>=0;k--) {
			for (int o = 0;o<space;o++) {
				ans+=" ";
			}
			for (int p = 0;p<count;p++) {
				ans+="*";
						
			}
			count-=2;
			space++;
			ans+="\n";
		}
			
		System.out.print(ans);
	}
	
	
}
