package array;

import java.util.Arrays;

public class ArrangeInAlternateWay {

	public static void main(String[] args) {
		int a[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
				//{1,-1,2,3,-2};
		//method1BrutForce(a);
		//method2QS(a);
		methodMaxMin(a);
	}
	
	private static void methodMaxMin(int[] a) {
		int low =0;
		int high = a.length-1;
		quickSort(a, low, high);
		//sort2(a);
		
		System.out.println(Arrays.toString(a));
		//arrange(a);
		
		int res[] = new int[a.length]; 
		int firstInd = 0;
		int lastInd = res.length-1;
		
		for (int i = 0; i < res.length; i++) {
			if(i%2 ==0) {
				res[i] = a[firstInd++];
			}else {
				res[i] = a[lastInd--];
			}
			
		}
		System.out.println(Arrays.toString(res));
	}

	private static void sort2(int a[]) {
		int pivot = 0;
		int i=-1;
		for (int j = 0; j < a.length; j++) {
			if(a[j] < pivot) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
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
		int i=-1, temp = 0;
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

	private static void method2QS(int[] a) {
		int pivot = 0;
		int i=-1;
		for (int j = 0; j < a.length; j++) {
			if(a[j] < pivot) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		
		System.out.println("Sorted array with -ve and +ve : "+i+" is : "+Arrays.toString(a));
		//{-2,-1,-5,-3,9,4,5,0,2,}
		
		int neg = 0, pos = i+1;
		while(pos < a.length && neg < pos && a[neg] <=0) {
			int temp = a[neg];
			a[neg] = a[pos];
			a[pos] = temp;
			neg = neg+2;
			pos++;
		}
		System.out.println("finals array : "+Arrays.toString(a));
	}
	
	private static void arrange(int[] a) {
		int pos = -1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				pos++;
			}else {
				pos++;
				break;
			}
		}
		//System.out.println(pos);
		int neg = 0;
		while(neg < pos && pos <a.length && a[neg] <0) {
			int temp = a[neg];
			a[neg] = a[pos];
			a[pos] = temp;
			neg = neg+2;
			pos = pos+1;
		}
	}


	private static void method1BrutForce(int a[]){
		int[] positive = new int[3];
		int negative[] = new int[2];;
		int j = 0;
		int k=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				positive[j] = a[i];
				j++;
			}else {
				negative[k] = a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(positive));
		System.out.println(Arrays.toString(negative));
		System.out.println("Before sorting : "+Arrays.toString(a));
		j=0;
		k=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0 && j<negative.length) {
				a[i] = negative[j];
				j++;
			}else {
				a[i] = positive[k];
				k++;
			}
		}
		System.out.println("After sorting : "+Arrays.toString(a));
	}

}
