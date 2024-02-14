package array;

import java.util.Arrays;

public class LargestNumFromNumOrDigit {

	public static void main(String[] args) {
		int a[] = {2,8,1,7,9,30};// 9873021
		largestNumberFromDigit(a);
		
		int num = //1203465; //6543210
		38293367; //98763332
		largestNumberFromNum(num);
	}

	private static void largestNumberFromNum(int num) {
		String s = String.valueOf(num); //Integer.toString(num);
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				String s1 = c[i]+""+c[j];
				String s2 = c[j]+""+c[i];
				if(Integer.parseInt(s2) > Integer.parseInt(s1)) {
					char temp = c[j];
					c[j] = c[i];
					c[i] = temp;
				}
 			}
		}
		System.out.println("Largest num from num is : ");
		for (int i = 0; i < c.length; i++) {
			//res = res+a[i];
			System.out.print(c[i]+"");
		}
	}

	private static void largestNumberFromDigit(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				String s = a[i]+""+a[j];
				String s1 = a[j]+""+a[i];
				if(Integer.parseInt(s1) > Integer.parseInt(s)) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
 			}
		}
		String res = "";
		System.out.println("Largest num from digit is : ");
		for (int i = 0; i < a.length; i++) {
			res = res+a[i];
			System.out.print(a[i]+"");
		}
		System.out.println("");
		System.out.println("Largest num from digit is : "+res);
	}

}
