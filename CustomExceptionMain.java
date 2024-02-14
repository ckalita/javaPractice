class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
}


public class CustomExceptionMain {

	public static void main(String[] args) {
		try {
			checkAge(13);
		}catch (AgeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void checkAge(int age) throws AgeException {
		if(age < 18) {
			throw new AgeException("Invalid age");
		}
		
	}

}
