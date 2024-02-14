package array;

public class SubarrWithSum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4, 2, -3, 1, 6,-6};
		findSubArr(a);
	}

	private static void findSubArr(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i];
			for (int j = i+1; j < a.length; j++) {
				sum = sum + a[j];
				if(sum ==0) {
					System.out.println("Range is : ("+i+","+j+")");
				}
			}
		}
	}

}
