package array;

import java.util.Arrays;

public class LargestNumberWithBound {

	public static void main(String[] args) {
		int a[] = {8,7,1}, ub = 800;  //781
			//{8,7,1}, ub = 200;  //187
			//{8,7,1}, ub = 1000;  //871
		
		int low = 0;
		int high = a.length -1;
		quickSort(a, low, high);
		
		System.out.println("After sort: "+Arrays.toString(a));
		
		formNumber(a, ub);
	}

	private static void formNumber(int[] a, int ub) {
		ub = ub/100;
		int pos = 0;
		String min = a[0]+"";
		for (int i = 0; i < a.length; i++) {
			if(a[i] < ub) {
				min = a[i]+"";
				pos = i;
			}else {
				break;
			}
		}
		
		for (int i = a.length-1; i >=0; i--) {
			if(pos != i) {
				min = min + a[i];
			}
		}
		
		System.out.println(min);
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
		int temp = 0;
		int i = -1;
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
