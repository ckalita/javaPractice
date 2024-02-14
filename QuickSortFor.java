package array;

import java.util.Arrays;

public class QuickSortFor {

	public static void main(String[] args) {
		int a[] = {9, 4, 0, 1, 25, 1, 0};
				//{10,30,20,20,60,50,40};
			//{10,7,11,8,9,1,5};
		int low = 0;
		int high = a.length -1;
		System.out.println("before : "+Arrays.toString(a));
		quickSort(a,low,high);
		System.out.println("After : "+Arrays.toString(a));
	}

	private static void quickSort(int[] a, int low, int high) {
		if(low <high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
		
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = -1; int temp = 0;
		for (int j = 0; j < a.length; j++) {
			if(a[j] <= pivot) {
				i++;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		
		temp = a[i];
		a[i] = a[low];
		a[low] = temp;
		return i;
	}

}
