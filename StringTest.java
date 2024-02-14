package String;

public class StringTest {

	String berry = "blue";
	public static void main(String[] args) {
		new StringTest().juice("straw");

	}
	
	void juice(String berry) {
		this.berry = "rasp";
		System.out.println(berry + "berry");
		System.out.println(this.berry + "berry");
	}

}
