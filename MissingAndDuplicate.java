package array;

public class MissingAndDuplicate {
	public static void main(String[] args) {
		int a[] = {6,1,2,8,3,4,7,10,5};
		missingNumber(a);
		
		System.out.println("duplicate number");
		int b[] = {6,1,2,8,3,4,4,9,7,10,5};
		duplicateNumber(b);
	}

	private static void duplicateNumber(int[] a) {
		int n = 10;
		int sumOfArray = 0;
		int actualSumofNum = n*(n+1)/2;
		System.out.println("actualSumofNum"+actualSumofNum);
		for (int i = 0; i < a.length; i++) {
			sumOfArray = sumOfArray + a[i];
		}
		System.out.println("sumOfArray : "+sumOfArray);
		System.out.println("duplicate number is : "+(sumOfArray-actualSumofNum));
		
	}

	private static void missingNumber(int[] a) {
		int n = 10;
		int sumOfArray = 0;
		int actualSumofNum = n*(n+1)/2;
		System.out.println("actualSumofNum"+actualSumofNum);
		for (int i = 0; i < a.length; i++) {
			sumOfArray = sumOfArray + a[i];
		}
		System.out.println("sumOfArray : "+sumOfArray);
		System.out.println("Missing number is : "+(actualSumofNum-sumOfArray));
	}

}
