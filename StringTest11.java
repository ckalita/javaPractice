
public class StringTest11 {

	public static void main(String[] args) {
		String str1 = new String("java");

		String str2 = new String("java"); 
		
		String str3 = "java";
		String str4 = "java";

		if(str1 ==str2){
			System.out.println("if block");
		}else{
			System.out.println("else block");
		}
		
		if(str4 ==str3){
			System.out.println("if block");
		}else{
			System.out.println("else block");
		}
		
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("if block");
		}else{
			System.out.println("else block");
		}

	}

}
