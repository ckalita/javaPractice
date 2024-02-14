package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringSequenceTest {

	public static void main(String[] args) {
		String org = "abcde";
		String sec = "ace"; //true
					//"aec";  //false
					//"abde";
		
		//boolean check = checkSeq(org, sec);
		
		boolean check = checkSeqForMap(org, sec);
		if(check) {
			System.out.println("Yes, in sequence");
		}else {
			System.out.println("No, not in sequence");
		}
	}

	private static boolean checkSeqForMap(String org, String sec) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		
		for (int i = 0; i < sec.length(); i++) {
			hm.put(sec.charAt(i), i);
		}
		
		System.out.println(hm);
		
		int k = 0;
		for (int i = 0; i < org.length(); i++) {
			if(hm.containsKey(org.charAt(i))) {
				hm1.put(org.charAt(i), k);
				k++;
			}
		}
		
		System.out.println(hm1);
		
		for (Entry<Character, Integer> entry :hm.entrySet()) {
			char c = entry.getKey();
			System.out.println(entry.getValue() + " : "+hm1.get(c));
			if(entry.getValue() != hm1.get(c)) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean checkSeq(String org, String sec) {
		List<Character> list = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for (int i = 0; i < sec.length(); i++) {
			list.add(sec.charAt(i));
		}
		
		
		for (int i = 0; i < org.length(); i++) {
			if(list.contains(org.charAt(i))) {
				list2.add(org.charAt(i));
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) != list2.get(i)) {
				return false;
			}
		}
		return true;
		
		
	}

}
