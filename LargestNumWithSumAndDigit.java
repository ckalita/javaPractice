
public class LargestNumWithSumAndDigit {

	public static void main(String[] args) {
		int sum = //9;
		30;
		int digit = //2; 
				4;
		
		System.out.print("Largest Num: ");
		int[] res = formNumber(sum, digit);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		System.out.println();
		
		System.out.print("Smallest Num: ");
		res = formSmallest(sum, digit);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		
		String result = formNumberString(sum, digit);
		System.out.println("String number is : "+result);
		
	}

	private static int[] formSmallest(int sum, int digit) {
		int res[] = new int[digit];
		sum = sum-1;
		for (int i = digit-1; i >0; i--) {
			
			if(sum > 9) {
				res[i] = 9;
				sum = sum - 9;
			}else {
				res[i] = sum;
				sum = 0;
			}
		}
		res[0] = sum+1;
		return res;
	}

	private static int[] formNumber(int sum, int digit) {
		int res[] = new int[digit];
		//int sum1= sum;
		for (int i = 0; i < digit; i++) {
			
			if(sum > 9) {
				res[i] = 9;
				sum = sum - 9;
			}else {
				res[i] = sum;
				sum = 0;
			}
		}
		
		
		
		return res;
	}
	
	private static String formNumberString(int sum, int digit) {
		String result = "";
		for (int i = 0; i < digit; i++) {
			if(sum > 9) {
				result = result+""+9;
				sum = sum-9;
			}else {
				result = result+""+sum;
				sum=0;
			}
		}
		
		return result;
		
	}

}
