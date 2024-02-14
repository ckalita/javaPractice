import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapbyValue {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A",80);
		hm.put("C",90);
		hm.put("B",84);
		hm.put("E",81);
		hm.put("D",82);
		
		System.out.println(hm);
		
		HashMap<String, Integer> hm2 = sortByValue(hm);
		
		for(Map.Entry<String, Integer> entry : hm2.entrySet()) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}

	
	
	private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		HashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			hm1.put(entry.getKey(), entry.getValue());
		}
		return hm1;
		
	}
	
	private static HashMap<String, Integer> sortByValue2(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		System.out.println("Sorted list : "+list);
		HashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry : list) {
			hm1.put(entry.getKey(), entry.getValue());
		}
		return hm1;
	}

}
