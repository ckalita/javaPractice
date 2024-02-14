package array;

import java.util.Arrays;

public class SortByMaxMin {

	public static void main(String[] args) {
		int[] a = //{1,2,3,4,5,6,7,8,9}; // [9, 1, 8, 2, 7, 3, 6, 4, 5]
				//{1,2,3,4,5,6,7,8}; //[8, 1, 7, 2, 6, 3, 5, 4]
				{2,3,4,6,8}; //[8,2,6,3,4]
		//sortMaxMin(a);
		
		//System.out.println(Arrays.toString(a));
		sortMaxMinCyclic(a);
	}

	

	private static void sortMaxMinCyclic(int[] a) {
		int res[] = new int[a.length];
		int firstInd = 0;
		int lastind = a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				res[i] = a[lastind--];
			}else {
				res[i] = a[firstInd++];
			}
			
		}
		System.out.println(Arrays.toString(res));
		
	}



	private static void sortMaxMin(int[] a) {
		int minInd = 0;
		int maxInd = a.length-1;
		int max = //10;
				a[maxInd]+1; //10;
		for (int i = 0; i < a.length; i++) {
			if(i%2 == 0) {
				a[i] = a[i]+(a[maxInd] % max) * max;
				maxInd--;
			}else {
				a[i] = a[i]+(a[minInd] % max) * max;
				minInd++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i]/max;
		}
		System.out.println("Final array");
		System.out.println(Arrays.toString(a));
	}

}
