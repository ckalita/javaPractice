package array;

import java.util.HashSet;

public class SubarrInGivenArr {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b= {8,9,1,2,4,3};
		
		boolean isSubArray = checkSubarrInGivenArr(a,b);
		System.out.println(isSubArray);
	}

	private static boolean checkSubarrInGivenArr(int[] a, int[] b) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < b.length; i++) {
			hs.add(b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if(!hs.contains(a[i])) {
				return false;
			}
		}

		return true;
	}

}
