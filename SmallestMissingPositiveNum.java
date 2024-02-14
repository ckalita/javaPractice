package array;

import java.util.Arrays;
import java.util.HashMap;

public class SmallestMissingPositiveNum {

	public static void main(String[] args) {
		int a[] = //{ 2, 3, -7, 6, 8, 1, -10, 15 };
				{1,2,3,4,5}; //6
				//{1,4,5,2}; //3
			//{1, 1, 0, -1, -2}; //2
				//{ 2, 3, -7, 6, 8, 1, -10, 15 }; //4
		System.out.println(findMissing(a));
		//findMissing(a);
	}

	private static int findMissing(int[] a) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer >();
		for (int i = 0; i <a.length; i++) {
			if(a[i]>0)
			  hm.put(a[i], i);
		}
		System.out.println(hm);
		int i = 1;
		
		for (; i <=a.length; i++) {
			if(!hm.containsKey(i)) {
				System.out.println("Smallest missing +ve num : "+i);
				return i;
			}
		}
		
		return i;
		
	}

}
