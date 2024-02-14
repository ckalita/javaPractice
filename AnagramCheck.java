package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class AnagramCheck {
	
	public static void main(String[] args) {
		String s = "silent"; 
			//"aab";
		String s1 = "listen"; 
			//"bba";
		
		//boolean isAnagram = checkAnagram(s, s1); //not correct
		//System.out.println("If isAnagram : "+isAnagram);
		
		boolean isAnagram1 = checkAnagram1(s, s1);
		System.out.println("If isAnagram1 : "+isAnagram1);
		
		boolean isAnagramHashMap = checkAnagramHashMap(s, s1);
		System.out.println("If isAnagramHashMap : "+isAnagramHashMap);
	}
	
	private static boolean checkAnagramHashMap(String s, String s1) {
		if(s.length() != s1.length()) {
			return false;
		}
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
		for (int i = 0; i < s1.length(); i++) {
			if(hm.containsKey(s1.charAt(i))) {
				hm.put(s1.charAt(i), hm.get(s1.charAt(i))-1);
			}
		}
		
		System.out.println(hm);
		
		for(Entry<Character, Integer> entry : hm.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key+" : "+value);
			if(entry.getValue() > 0) {
				return false;
			}
		}
		
		return true;
	}
	

	private static boolean checkAnagram1(String s, String s1) {
		if(s.length() != s1.length()) {
			return false;
		}
		
		String[] sArray = s.split("");
		//System.out.println(Arrays.toString(sArray));
		List<String> list = Arrays.asList(sArray);
		
//		List<Character> list = new ArrayList<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			list.add(s.charAt(i));
//		}
		System.out.println(list);
		
		for (int i = 0; i < s1.length(); i++) {
			list.remove(Character.valueOf(s1.charAt(i)));
		}
		//System.out.println(list);
		
		if(list.isEmpty()) {
			return true;
		}
		
		return false;
	}

	private static boolean checkAnagram(String s, String s1) {
		
		if(s.length() != s1.length()) {
			return false;
		}
		
		
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		//System.out.println(list);
		
		List<Character> list1 = new ArrayList<Character>();
		for (int i = 0; i < s1.length(); i++) {
			list1.add(s1.charAt(i));
		}
		
		list.removeAll(list1);
		
		if(list.isEmpty()) {
			return true;
		}
		
		return false;
	}

}
