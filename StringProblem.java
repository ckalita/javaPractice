package String;

public class StringProblem {

	public static void main(String[] args) {
		String s = //"booTCamP"; //bootcamp
				"Xobin"; //XOBIN
		printNewString(s);
	}

	private static void printNewString(String s) {
		char c = s.charAt(0);
		String res = "";
		if(Character.isUpperCase(c)){
			System.out.println(s.toUpperCase());
			for (int i = 0; i < s.length(); i++) {
				res = res + Character.toUpperCase(s.charAt(i));
			}
		}else {
			for (int i = 0; i < s.length(); i++) {
				res = res + Character.toLowerCase(s.charAt(i));
			}
		}
		System.out.println(res);
		
	}

}
