package array;

import java.util.Arrays;

public class MultiOf3Integer {

	public static void main(String[] args) {
		int a[] = {1,-20,5,9,-16,-30 }; //5400
			//{1,-20,5,9,16,-30 }; //9600
			//{10, 3, 5, 6, 20}; //1200
		
		//withQuickSort(a);
		menthodFor(a);

	}

	private static void menthodFor(int[] a) {
		int maxValue = Integer.MIN_VALUE; 
		for (int i = 0; i < a.length-2; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				for (int k = j+1; k < a.length; k++) {
					maxValue = Math.max(maxValue, a[i]*a[j]*a[k]);
				}
			}
		}
		System.out.println("MaxValue is : "+maxValue);
		
	}

	private static void withQuickSort(int[] a) {
		int low  = 0;
		int high = a.length-1;
		quickSort(a, low, high );
		System.out.println(Arrays.toString(a));
		
		findMul(a, high);
		
	}

	private static void findMul(int[] a, int max) {
		int res = a[max]*a[max-1]*a[max-2];
		System.out.println(res);
	}

	private static void quickSort(int[] a, int low, int high) {
		if(low < high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi-1 );
			quickSort(a, pi+1, high );
		}
		
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i=-1, temp =0;
		for (int j = 0; j < a.length; j++) {
			if(a[j] <= pivot) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j]= temp;
			}
		}
		
		temp = a[low];
		a[low] = a[i];
		a[i] = temp;
		
		return i;
	}

}
