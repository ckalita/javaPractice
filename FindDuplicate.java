package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicate {

	public static void main(String[] args) {
		int a[] = {2,3,1,2,3,2};
		
		System.out.println("findDuplicate2 ");
		findDuplicate2(a);
	}
	
	private static void findDuplicate2(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(!hm.containsKey(a[i])) {
				hm.put(a[i], 1);
			}else {
				hm.put(a[i], hm.get(a[i])+1);
			}
		}
		System.out.println(hm);
		for(Map.Entry<Integer, Integer> entry :hm.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey()+",");
			}
		}
	}

	

}
