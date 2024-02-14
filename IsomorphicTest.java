import java.util.HashMap;

public class IsomorphicTest {

	public static void main(String[] args) {
		
		String s = "babc" ;
				//"add";
		String s1 = "badc"; 
			//"egg";
		
		boolean check = checkIsomorphic(s,s1);
		System.out.println(check);

	}

	private static boolean checkIsomorphic(String s, String s1) {
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), s1.charAt(i));
			}else {
				char current = hm.get(s.charAt(i));
				if(current != s1.charAt(i)) {
					return false;
				}
			}
		}
		
		return true;
		
	}

}
