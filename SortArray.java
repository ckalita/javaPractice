package array;

import java.util.Arrays;

public class SortArray {

	public static void printArray(int arr[]) {
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int arr[] = {10,30,20,60,50,40};
		System.out.println("before sort : ");
		printArray(arr);
		//bubbleSort(arr);
		int low = 0;
		int high = arr.length -1;
		quickSort(arr, low, high);
		System.out.println("after sort : ");
		printArray(arr);
	}

	private static void quickSort(int[] a, int low, int high) {
		if(low <high) {
			int pi = partition(a, low, high);
			System.out.println(pi);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = -1, temp = 0;
		for (int j = 0; j < a.length; j++) {
			if(a[j] <= pivot) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		//System.out.println(Arrays.toString(a));
		temp = a[i];
		a[i] = a[low];
		a[low] = temp;
		return i;
	}

	private static void bubbleSort(int[] arr) {
		int temp;
		
		System.out.println("method bubbleSort"); 
		for(int i=0;i<arr.length;i++) { 
			for(int j=i+1; j<arr.length;j++) { 
				//ascending order 
				if(arr[i] > arr[j]) { 
					temp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp; 
				}
			} 
			//condition to decending order
			//if(arr[i] < arr[j]) //output 50 40 30 20 10 } } printArray(arr);
		}
	}

}
