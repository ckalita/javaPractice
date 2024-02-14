import java.util.ArrayList;
import java.util.Arrays;

public class MainNull {
	static int count = 0;
	public static void main(String[] args) {
		
		//ArrayList<String> word = {"Hello", "World"};
		//ArrayList words = Arrays.asList("Hello", "World");
		//ArrayList<String> wordss = new ArrayList<String>() {"Hello", "World"};
		//ArrayList<String> wordsss =  new ArrayList<>(Arrays.asList("Hello", "World"));
		
		if(count < 3) {
			count++;
			main(null);
		}else {
			return;
		}
		System.out.println("Hello");
	}

}
