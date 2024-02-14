
package array;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithSum {

	public static void main(String[] args) {
		int a[] = {1, 5, 7, 1,-1,5};
		int N = 4, k = 6;
		//int a[] = {1, 1,1, 1};
		//int N = 4, k = 2;
		//countPairOfSum(a,k);
		countPairOfSumMap(a,k);
	}

	private static void countPairOfSumMap(int[] a, int k) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(hm.containsKey(k-a[i])) {
				
				count = count + hm.get(k-a[i]);
				System.out.println((k-a[i]+" "+a[i]));
			}
			
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}else {
				hm.put(a[i], 1);
			}
			
			
		}
		
		
		System.out.println("Count is new : "+count);
		System.out.println(hm);
			
	}

	private static void countPairOfSum(int[] a, int k) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			//sum = a[i];
			for (int j = i+1; j < a.length; j++) {
				sum = a[i] +a[j];
				//System.out.println("Sum is : "+sum);
				if(sum == k) {
					++count;
					System.out.println(i+" "+j);
					//System.out.println(count);
				}
				
			}
		}
		System.out.println("Count of pair is : "+count);
	}

}
