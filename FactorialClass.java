
package array;

public class FactorialClass {
	public static void main(String[] args) {
		int n = 5;
		factorial(n);
		int fact = factorialRecursive(5);
		System.out.println("Factorial recursive is : "+fact);
	}

	private static int factorialRecursive(int n) {
		if(n == 0)
			return 1;
		else
			return n*factorialRecursive(n-1);
	}

	private static void factorial(int n) {
		int fact = 1;
		for (int i = n; i >0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial is : "+fact);
	}
}
