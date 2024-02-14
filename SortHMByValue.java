package Practice;

import java.util.*;

public class SortHMByValue {
	public static void main(String[] args) {
		String s = "chandankalita";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		//count frequency
		for (int i = 0; i < s.length(); i++) {
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			}else {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
		}
		
		System.out.println(hm);
		
		List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		System.out.println(list);
		
	}

}
