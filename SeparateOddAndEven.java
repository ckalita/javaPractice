package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeparateOddAndEven {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		separateOut(a);
		usingSameArray(a);
	}
	

	private static void usingSameArray(int[] a) {
		int r[] = new int[a.length];
		int l=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 !=0) {
				r[l] = a[i];
				l++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 ==0) {
				r[l] = a[i];
				l++;
			}
		}
		System.out.println(Arrays.toString(r));
	}


	private static void separateOut(int[] a) {
		
		
		Map<String, List<Integer>> hm = new HashMap<>();
		hm.put("even", new ArrayList<Integer>());
		hm.put("odd", new ArrayList<Integer>());
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 ==0) {	
					hm.get("even").add(a[i]);				
			} else {
				hm.get("odd").add(a[i]);	
			}
		}
		System.out.println(hm);
		
		//System.out.println(hm);
	}

}
