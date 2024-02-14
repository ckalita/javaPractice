import java.util.Arrays;

public class MinMaxSort {
	
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 10, 6, 8, 3, 9 };
		
		int low = 0;
		int high =a.length;
		quickSort(a, low, high);
		System.out.println("After sort : "+Arrays.toString(a));
		
		minMaxSort(a);
	}
	
	private static void minMaxSort(int[] a) {
		int res[]  = new int[a.length];
		int firstInd = 0;
		int lastInd  = a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(i%2 == 0) {
				res[i] = a[firstInd++];
			}else {
				res[i] = a[lastInd--];
			}
			System.out.println("After min max sort : "+Arrays.toString(res));
		}
		System.out.println("After min max sort : "+Arrays.toString(res));
		
	}

	public static void quickSort(int a[], int low, int high){
		if(low < high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
	}


	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i =-1;
		int temp = 0;
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
