package String;

public class PalindromInt {

	public static void main(String[] args) {
		int n = 454;
		int r =0, sum =0, temp = n;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
			System.out.println("n is : "+n);
		}
		System.out.println("Sum is : "+sum);
		if(sum ==temp) {
			System.out.println("its a palidrom : "+temp);
		}else {
			System.out.println("not palidrom : "+temp);
		}
	}

}
