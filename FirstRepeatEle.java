package array;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatEle {

	public static void main(String[] args) {
		int a[] = {1,5, 3, 4, 3, 5, 7, 6};
		firstRepeatEleSet(a);
		firstRepeatEleMap(a);
	}

	private static void firstRepeatEleSet(int[] a) {
		//HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		int min = -1;
		for (int i = a.length-1;  i >= 0 ; i--) {
			if(hs.contains(a[i])) {
				min=i;
			}else {
				hs.add(a[i]);
			}
		}
		System.out.println(hs);
		System.out.println("min is : "+min);
		if(min !=-1) {
			System.out.println("reapet ele is : "+a[min]);
		}else {
			System.out.println("No ele present");
		}
		
	}
	
	private static void firstRepeatEleMap(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0; i < a.length; i++) {
			if(!hm.containsKey(a[i])) {
				hm.put(a[i],1);
			}else {
				hm.put(a[i], hm.get(a[i])+1);
			}
		}
		for (int i = 0;  i < a.length ; i++) {
			if(hm.get(a[i]) > 1) {
				System.out.println("reapet ele is : "+a[i]+" and position is : "+i);
				break;
			}
		}
	}

}
