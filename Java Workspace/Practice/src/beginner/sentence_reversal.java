package beginner;

public class sentence_reversal {
	public static void main(String[] args) {
		System.out.print(sentence_rev("Hello there bro"));
	}
	
	public static String sentence_rev(String str) {
		String ans = "";
	
		String arr[] = str.split(" ");
		
		for (int i = arr.length-1; i>-1 ; i--) {
			ans+=arr[i]+" ";
		}
		
		return ans;
	}
}
