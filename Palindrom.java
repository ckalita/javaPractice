package String;

public class Palindrom {

	public static void main(String[] args) {
		String s = "abbcba"; //true
				//"abcba"; //true
				//"abbcba"; //false
				//"1234321"; //true
		//checkPalidrom(s);
		System.out.println("Is palidrome : "+checckPalindrom(s));
	}

	private static boolean checckPalindrom(String s) {
		int start = 0;
		int end = s.length() - 1;
		while(start <= end) { 
			System.out.println(s.charAt(start) +" : "+s.charAt(end));
			if(s.charAt(start) !=s.charAt(end)) {
				return false;
			} 
			start++; 
			end--; 
		}
		return true;
		
	}

	private static void checkPalidrom(String s) {
		String result = "";
		for (int i = s.length()-1; i >=0; i--) {
			result = result + s.charAt(i);		
		}
		System.out.println(result);
		if(result.equals(s)) {
			System.out.println("its a palidrom : "+result);
		}else {
			System.out.println("not palindrom : "+result);
		}
	}

}
