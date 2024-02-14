package array;

import java.util.Arrays;

public class SaureRootTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,0,-1};
		int b[] = {5,3};
		
		int res[] = new int[a.length+b.length];
		
		findSqRoot(a,b,res);
		System.out.println("Result before sort");
		//printArray(res);
		System.out.println(Arrays.toString(res));
		
		int low = 0;
		int high = res.length -1;
		quickSort(res, low, high);
		
		System.out.println();
		System.out.println("Result after sort");
		printArray(res);
	}

	private static void findSqRoot(int[] a, int[] b, int[] res) {
		int k = 0;
		for (int j = 0; j < a.length; j++) {
			res[k] = a[j] * a[j];
			k++;
		}
		
		for (int j = 0; j < b.length; j++) {
			res[k] = b[j] * b[j];
			k++;
		}
	}

	private static void printArray(int[] res) {
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
	}

	private static void quickSort(int[] res, int low, int high) {
		if(low < high) {
			//System.out.println("Calling partition");
			int pi = partition(res, low, high);
			quickSort(res, low, pi-1);
			quickSort(res, pi+1, high);
		}
	}

	private static int partition(int[] res, int low, int high) {
		int pivot = res[low];
		int i = -1;
		int temp = 0;
		for (int j = 0; j < res.length; j++) {
			//System.out.println("inside for");
			if(res[j] <= pivot) {
				i++;
				temp = res[j];
				res[j] = res[i];
				res[i] = temp;
			}
		}
		temp = res[i];
		res[i] = res[low];
		res[low] = temp;
		
		return i;
	}

}
