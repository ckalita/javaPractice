package array;

import java.util.Arrays;

public class SegregareNegative {

	public static void main(String[] args) {
		int arr[] = {5,1, -1, 3, 2, -7, -5, 11, 6,-3,-4};
		int n = arr.length;
		segregareNegative(arr, n);
		System.out.println("After sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

	private static void segregareNegative(int[] arr, int n) {
		int temp;
		int j=-1;
		for (int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
	}

}
