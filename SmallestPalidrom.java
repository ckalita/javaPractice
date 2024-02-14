package String;

public class SmallestPalidrom {

	public static void main(String[] args) {
		String s = "zyzz"; //y
		
		checkSmallestPalindrom(s);
		longestPalidrom("forgeeksskeegfor");
	}

	private static void longestPalidrom(String s) {
		int start = 0;
		int end = s.length()-1;
		String res = "";
		while(start <= end) {
			if(s.charAt(start) == s.charAt(end)) {
				res = res + s.charAt(start);
			}
			start++;
			end--;
		}
		System.out.println("longest palindrom: "+res);
		
	}

	private static void checkSmallestPalindrom(String s) {
		String res="";
		
		char c = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			c = (char)Math.min(c, s.charAt(i));
		}
		
		System.out.println("Smalles palindrom : "+c);
	}

}
