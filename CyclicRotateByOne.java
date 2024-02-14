package array;

public class CyclicRotateByOne {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		cyclicRotate(a);
	}

	private static void cyclicRotate(int[] a) {
		int size = a.length;
		int x = a[size-1];
		for(int i=size-1;i>0;i--) {
			a[i] = a[i-1];
		}
		a[0] = x;
		printArray(a);
	}
	
	public static void printArray(int arr[]) {
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
