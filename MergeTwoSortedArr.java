package array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwoSortedArr {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5}, b[] = {2, 4, 6, 8} ; // [1, 2, 3, 4, 4, 5, 6, 8]
		//mergeQuickSort(a,b);
		merge(a,b);
	}

	private static void merge(int[] a, int[] b) {
		Map<Integer, Integer> hm = new TreeMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			hm.put(a[i], i);
		}
		
		for (int i = 0; i < b.length; i++) {
			hm.put(b[i], i);
		}
		
		//System.out.println(hm);
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.print(entry.getKey());
			
		}
	}

	private static void mergeQuickSort(int[] a, int[] b) {
		int result[] = new int[a.length+b.length];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			result[k] = a[i];
			k++;
		}
		
		for (int i = 0; i < b.length; i++) {
			result[k] = b[i];
			k++;
		}
		
		System.out.println("merge array "+ Arrays.toString(result));
		
		int low = 0;
		int high = result.length - 1;
		quickSort(result, low, high);
		
		System.out.println("Final merge array "+ Arrays.toString(result));
	}

	private static void quickSort(int[] a, int low, int high) {
		if(low < high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
		
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int temp=0, i=-1;
		for (int j = 0; j < a.length; j++) {
			if(a[j] <= pivot) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		temp = a[low];
		a[low] = a[i];
		a[i] = temp;
		
		return i;
	}
	

}
