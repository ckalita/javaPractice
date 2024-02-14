package String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "i like this program very much";
		System.out.println("Before : "+s);
		reversString(s);

	}

	private static void reversString(String s) {
		String word[] = s.split(" ");
		String result = "";
		for (int i = word.length-1; i >=0; i--) {
			result = result +" "+ word[i];
		}
		System.out.println("After : "+result);
	}

}
