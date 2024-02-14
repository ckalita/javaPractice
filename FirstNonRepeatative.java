package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatative {

	public static void main(String[] args) {
		String s = "ABCDBAGHCHFAC";
		checkRepeatative(s);
	}

	private static void checkRepeatative(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
		for (int i = 0; i < s.length(); i++) {
			if(hm.get(s.charAt(i)) ==1) {
				System.out.println("First not repeatative char : "+s.charAt(i));
				break;
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(hm.get(s.charAt(i)) > 1) {
				System.out.println("First  repeatative char : "+s.charAt(i));
				break;
			}
		}
		
		
		for(Entry<Character, Integer> map : hm.entrySet()) {
			if(map.getValue() % 2 !=0) {
				System.out.println("First character which occurence is Odd number : "+map.getKey() +" is repeatating "+map.getValue());
				break;
			}
		}
		
	}

}
