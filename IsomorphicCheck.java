package Practice;

import java.util.HashMap;

public class IsomorphicCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = //"babc" ;
		"adda";
		String s1 = //"dadc"; 
		"egg";

		
		boolean isIsomorphic = checkIsomorphic(s, s1);
		System.out.println("If isomorphic : "+isIsomorphic);
	}

	private static boolean checkIsomorphic(String s, String s1) {
		if(s.length() != s1.length()) {
			return false;
		}
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			
			if(hm.containsKey(s.charAt(i))) {
				char c = hm.get(s.charAt(i));
				if(c != s1.charAt(i)) {
					return false;
				}
			}else {
				hm.put(s.charAt(i), s1.charAt(i));
			}
		}
		return true;
	}

}
