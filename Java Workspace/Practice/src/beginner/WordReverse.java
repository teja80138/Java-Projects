package beginner;

public class WordReverse {
	public static void main(String[] args) {
		System.out.println(reverse("Hello Neil"));
	}
	
	public static StringBuilder reverse(String str) {
		StringBuilder s = new StringBuilder();
		String[] arr = str.split(" ");
		for (int i = 0; i<arr.length;i++) {
			for (int j = arr[i].length()-1 ; j>=0;j--) {
				s.append(arr[i].charAt(j));
			}
			s.append(" ");
		}
		return s;
	}
}
