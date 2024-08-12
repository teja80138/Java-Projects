package Intermediate;

public class AnagramCheck {
	public static void main(String[] args) {
		System.out.println(AnagramCheck("alll","laal"));
	}
	public static boolean AnagramCheck(String strOne, String strTwo) {
		boolean ans = false;
		String str ="";
		int count = 0;
		for (int i = 0; i<strOne.length(); i++) {
			for (int j = 0; j<strTwo.length();j++) {
				if (strOne.charAt(i) == strTwo.charAt(j)) {
					count = j;
					
				}
			}
		}
		if (count==strOne.length()){
			ans = true;
		}
		
		return ans;
	}
}
