package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringAnagram {
	//String having same character
	public static void main(String[] args) {
		String str1 = "good";
        String str2 = "doog";
        
        boolean result = checkAnagram2(str1, str2);
        if(result) {
        	System.out.println("Both String are Anagram");
        }else {
        	System.out.println("Not Anagram");
        }
	}
	
	private static boolean checkAnagram2(String str1, String str2) {
		Set<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < str1.length(); i++) {
			hs.add(str1.charAt(i));
		}
		
		System.out.println(hs);
		Iterator<Character> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (int i = 0; i < str2.length(); i++) {
			if(!hs.contains(str2.charAt(i))) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	
	private static boolean checkAnagram1(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if(!hm.containsKey(str1.charAt(i))) {
				hm.put(str1.charAt(i), 1);
			}else {
				hm.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
			}
		}
		System.out.println(hm);
		for (int i = 0; i < str2.length(); i++) {
			if(hm.containsKey(str2.charAt(i))) {
				hm.remove(str2.charAt(i));
			}
		}
		System.out.println(hm);
		
		if(hm.size() == 0) { 
			return true; 
		}
		return false;
	}

	private static boolean checkAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if(!hm.containsKey(str1.charAt(i))) {
				hm.put(str1.charAt(i), 1);
			}else {
				hm.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
			}
		}
		System.out.println(hm);
		for (int i = 0; i < str2.length(); i++) {
			if(hm.containsKey(str2.charAt(i))) {
				hm.put(str2.charAt(i), hm.get(str2.charAt(i))-1);
			}
		}
		System.out.println(hm);
		for(char key : hm.keySet()) {
			if(hm.get(key) !=0) {
				return false;
			}
		}
		return true;
	}

}
