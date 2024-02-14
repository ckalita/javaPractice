package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort012 {

	public static void main(String[] args) {
		
		int arr[] = //{7,2,4,6,3};
				{0,1,2,0,1,2,0,1,2}; //0,0,0,1,1,1,2,2,2,
		//int low =0;
		//int high = arr.length;
		
		//quickSort(arr, low, high);
		//System.out.println("After sorting: "+Arrays.toString(arr));
		sort012Map(arr, arr.length);
		//sort012(arr, arr.length);
		//System.out.println("After sorting: ");
		//for (int i = 0; i < arr.length; i++) {
		//	System.out.print(arr[i]+",");
		//}
	}

	private static void sort012Map(int[] arr, int length) {
		HashMap<Integer, Integer> hm = new HashMap();
		
		for (int i = 0; i < arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		
		System.out.println(hm);
		
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer val = entry.getValue();
			for (int i = 0; i < val; i++) {
				System.out.print(entry.getKey());
			}
		}
		
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[low];
		int temp = 0;
		int i =-1;
		for (int j = 0; j < arr.length; j++) {
			if(pivot >= arr[j]) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i];
		arr[i] = arr[low];
		arr[low] = temp;
		
		
		return i;
	}

	private static void sort012(int[] arr, int length) {
		int i=0, count0 = 0,count1 = 0,count2=0;
		for(i=0; i<length;i++) {
			switch (arr[i]) {
			case 0: {
				count0++;
				break;
			}
			case 1: {
				count1++;
				break;
			}
			case 2: {
				count2++;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + arr[i]);
			}
		}
		
		i=0;
		while(count0 > 0) {
			arr[i++] = 0;
			count0--;
		}
		while(count1 > 0) {
			arr[i++] = 1;
			count1--;
		}
		while(count2 > 0) {
			arr[i++] = 2;
			count2--;
		}
	}

}
