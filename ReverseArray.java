package array;

public class ReverseArray {

	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		System.out.println(start +" : "+end);
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			//printArray(arr);
		}
	}
	
	public static void printArray(int arr[]) {
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		printArray(arr);
		reverseArray(arr);
		System.out.println("Reverse array is : ");
		printArray(arr);
	}

}
