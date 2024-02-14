package array;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] a = {0,1,3,0,5,6};
		moveZeroes(a);
		printArray(a);
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			
		}
	}

	private static void moveZeroes(int[] a) {
		//int pivot = 0;
		int i = -1;
		for (int j = 0; j < a.length; j++) {
			if(a[j] > 0) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
	}

}
