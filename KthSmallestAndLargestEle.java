package array;
import java.util.Iterator;

public class KthSmallestAndLargestEle {
	
	public static void main(String[] args) {
		int arr[] = {7,10,4,3,20,15};
		System.out.println("input array is :");
		printArray(arr);
		smallestHighestEle(arr, 3);
		//highestEle(arr, 2);
	}
	
	public static void smallestHighestEle(int arr[], int k) {
		int low = 0;
		int high = arr.length-1;
		quickSort(arr, low, high);
		System.out.println("Quick Sorted array is :");
		printArray(arr);
		System.out.println(k+"th smallest element is : "+arr[k-1]);
		System.out.println(k+"th highest element is : "+arr[arr.length-k]);
		
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i=-1, temp=0;
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

	
	
	
	public static void printArray(int arr[]) {
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
