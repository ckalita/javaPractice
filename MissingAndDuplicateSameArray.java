package array;

import java.util.HashMap;

public class MissingAndDuplicateSameArray {

	public static void main(String[] args) {
		int a[] = {2,2}; 
			//{1,2,2}; // dup 2 miss 3
				//{ 4, 3, 6, 2, 1, 1 };
			//{2,2};
				//{1, 3, 3};
		findMissingDuplicate(a);
	}

	private static void findMissingDuplicate(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(hm.containsKey(a[i])) {
				System.out.println("duplicate is : "+a[i]);
			}
			hm.put(a[i], i);
		}
		
		for (int i = 1; i <= a.length; i++) {
			if(!hm.containsKey(i)) {
				System.out.println("Missing ele is : "+i);
			}
		}
	}

}
