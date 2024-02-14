
public class LargestNumFromDigit {

	public static void main(String[] args) {
		int digit[] = {2,8,1,7,9,30};// 9873021
		int num = 1203465; //6543210
				//38293367; //98763332
		method1(digit);
		method2(num);
		//methodNum(num);
	}
	
	private static void methodNum(int num) {
		String s = Integer.toString(num);
		//char[] a = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				String s1 = s.charAt(i)+""+s.charAt(j);
				String s2 = s.charAt(j)+""+s.charAt(i);
				if(Integer.parseInt(s2) > Integer.parseInt(s1)) {
					char temp = s.charAt(i);
					s.replace(s.charAt(i), s.charAt(j));
					s.replace(s.charAt(j), temp);
					
				}
			}
		}
		
		System.out.println("Number is : "+s);
	}

	private static void method2(int num) {
		String s = Integer.toString(num);
		char[] a = s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				String s1 = a[i]+""+a[j];
				String s2 = a[j]+""+a[i];
				if(Integer.parseInt(s2) > Integer.parseInt(s1)) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("result is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	private static void method1(int[] digit) {
		for (int i = 0; i < digit.length; i++) {
			for (int j = i+1; j < digit.length; j++) {
				String s = digit[i]+""+ digit[j];
				String s1 = digit[j]+""+ digit[i];
				if(Integer.parseInt(s1) > Integer.parseInt(s)) {
					int temp = digit[i];
					digit[i] = digit[j];
					digit[j] = temp;
				}
			}
		}
		for (int i = 0; i < digit.length; i++) {
			System.out.print(digit[i]);
		}		
	}

}
