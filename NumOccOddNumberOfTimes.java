package array;

import java.util.HashMap;
import java.util.Map;

public class NumOccOddNumberOfTimes {

	public static void main(String[] args) {
		 int a[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		 checkForOdd(a);

	}

	private static void checkForOdd(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(!hm.containsKey(a[i])) {
				hm.put(a[i], 1);
			}else {
				hm.put(a[i], hm.get(a[i])+1);
			}
		}
		System.out.println(hm);
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(val % 2 !=0) {
				System.out.println("number key is "+key+" and occurence is : "+val);
			}
			
		}
		
		
		for(Integer b : hm.keySet()) {
			if(hm.get(b) % 2 !=0) {
				System.out.println("number is "+b+" and occurence is : "+hm.get(b));
			}
		}
	}

}
