package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeating {
	public static void main(String[] args) {
		int arr[] = //{ 9, 4, 1,9, 6, 7, 4 };
			{-1, 2, 2, -1, 3, 2};
        int n = arr.length;
        firstNonRepeating(arr, n);
	}

	private static void firstNonRepeating(int[] arr, int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
//			if(hm.containsKey(arr[i])) {
//				System.out.println("first repeating ele entryyyy : "+arr[i]);
//				break;
//			}
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}else {
				hm.put(arr[i],hm.get(arr[i])+1);
			}
		}
		System.out.println(hm);
		
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println("first non repeating ele entry : "+entry.getKey());
				break;
			}
			
		}
		
		
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			
			if(entry.getValue() > 1) {
				System.out.println("first repeating ele entry : "+entry.getKey());
				break;
			}
			
		}
	}
}
