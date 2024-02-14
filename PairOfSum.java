package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairOfSum {

	public static void main(String[] args) {
		int n=5;
		int ar[] = {1, 5, 7, 1,-1,5}, sum =6 ; //5
			//{1,3,5,7,9}, sum = 8; //2
			//{1, 1,1, 1}, sum = 2; //6
		
		countPair(ar, n, sum);
		findPairFor(ar, n, sum);
	}

	private static void findPairFor(int[] a, int n, int k) {
		System.out.println("in find pair for");
		int sum = 0;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				sum = a[i]+a[j];
				if(sum == k) {
					System.out.println(i+" "+j);
					count++;
				}
			}
		}
		System.out.println("Total pair : "+count);
	}

	private static void countPair(int[] ar, int n, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if(hm.containsKey(sum-ar[i])) {
				count = count + hm.get(sum-ar[i]);
				//System.out.println(hm.get(sum-ar[i])+" "+i);
			}
			
			if(hm.containsKey(ar[i])) {
				hm.put(ar[i], hm.get(ar[i])+1);
			}else {
				hm.put(ar[i], 1);
			}
		}
		System.out.println("Count of pair : "+count);
	}

}
