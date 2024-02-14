package array;

public class SecondMaxEle {

	public static void main(String[] args) {
		int[] a = {12,34,2,34,33,1}; //33
		
		findSecondMax(a);
	}

	private static void findSecondMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				secondMax = max;
				max = a[i];
			}else {
				if(a[i] > secondMax && a[i]!= max) {
					secondMax = a[i];
				}
			}
		}
		
		System.out.println("Second max is : "+secondMax);
	}

}
