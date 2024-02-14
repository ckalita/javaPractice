package String;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 5;
		fibonacci(i);
	}

	private static void fibonacci(int n) {
		int counter =0;
		int num1 = 0, num2=1;
		while(counter < n) {
			System.out.print(num1+" ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			counter +=1;
		}
	}

}
