package array;

public class SubarrOfSum {

	public static void main(String[] args) {
		int a[] = {1,2,3,7,5};
		int s= 15;
		int n =a.length;
		subArrOfSum(a, s, n);

	}

	private static void subArrOfSum(int[] a, int s, int n) {
		int sum, i, j;
		for (i = 0; i < n; i++) {
			sum = a[i];
			for(j=i+1;j<n;j++) {
				sum = sum + a[j];
				System.out.println("sum is : "+sum);
				if(sum == s) {
					System.out.println("position of array is : "+(i+1)+" to "+(j+1));
					break;
				}
				if(sum >s || j==n)
					break;
			}
			if(sum == s) {
				break;
			}
		}
		
	}

}
