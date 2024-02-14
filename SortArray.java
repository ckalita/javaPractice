package Practice;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		int a[] = new int[] {2,1,4,7,6,3,5};
		
		int low = 0;
		int high = a.length;
		quickSort(a, low, high);
		System.out.println("Sorted array is : "+Arrays.toString(a));
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
		int i =-1;
		int temp =0;
		
		for (int j = 0; j < a.length; j++) {
			if(pivot >= a[j]) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i];
		a[i] = a[low];
		a[low] = temp;
		
		return i;
	}

}
