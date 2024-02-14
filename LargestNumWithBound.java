import java.util.Arrays;

public class LargestNumWithBound {

	public static void main(String[] args) {
		int ub = 1000;
		int digit[] = {8,7,1};
		int low = 0;
		int high = digit.length-1;
		quickSort(digit,low,high);
		System.out.println(Arrays.toString(digit));
		
		maxNum(ub, digit);
		
	}

	private static void maxNum(int ub, int[] digit) {
		ub = ub/100;
		String min = digit[0]+"";
		int pos = 0;
		
		for(int i=1; i<digit.length; i++) {
			if(digit[i] < ub) {
				min = digit[i]+"";
				pos = i;
			}else {
				break;
			}
		}
		
		for(int i=digit.length-1; i>=0; i--) {
			if(i!=pos) {
				min = min + digit[i];
			}
		}
		
		System.out.println("Number is : "+min);
	}

	private static void quickSort(int[] digit, int low, int high) {
		if(low < high) {
			int pi = partition(digit,low,high);
			quickSort(digit, low, pi-1);
			quickSort(digit, pi+1, high);
		}
	}

	private static int partition(int[] digit, int low, int high) {
		int pivot = digit[low];
		int i = -1;
		int temp =0;
		for (int j = 0; j < digit.length; j++) {
			if(digit[j] <= pivot) {
				i++;
				temp = digit[i];
				digit[i] = digit[j];
				digit[j] = temp;
			}
		}
		
		temp = digit[i];
		digit[i] = digit[low];
		digit[low] = temp;
		return i;
	}

}
