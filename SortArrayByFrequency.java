import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayByFrequency {

	public static void main(String[] args) {
		int a[] = { 2, 5, 2, 8, 5, 6, 8, 8 };
		System.out.println(Arrays.toString(a));
		HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(!hm.containsKey(a[i]))
				hm.put(a[i], 1);
			else
				hm.put(a[i], hm.get(a[i])+1);
		}
		System.out.println(hm);
		
		HashMap<Integer, Integer> hm1 = sortByFreq(hm);
		System.out.println(hm1);
		for(Map.Entry<Integer, Integer> entry : hm1.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			for (int i = 0; i < value; i++) {
				System.out.print(key+ " ");
			}
		}
	}

	private static HashMap<Integer, Integer> sortByFreq(HashMap<Integer, Integer> hm) {
		List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		HashMap<Integer, Integer> hm1 = new LinkedHashMap<Integer, Integer>();
		
		for(Entry<Integer, Integer> entry : list) {
			hm1.put(entry.getKey(), entry.getValue());
		}
		
		return hm1;
	}

}
