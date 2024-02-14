
public class TryCatch {

	public static void main(String[] args) {
		int i =1;
		try{
			i++;
			System.out.println(i);
			//System.exit(0);
			return;
			//throw new NullPointerException();
		}catch(Exception e) {
			System.out.println("in catch");
			i++;
		}finally {
			System.out.println("in finally");
			i++;
			System.out.println(i);
		}
		
		System.out.println("outside try catch");
	}

}
