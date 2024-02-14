package Test;

class A{
	
	public void xyz(){
		System.out.println("in A");
	}
}

class B extends A{
	
	public void xyz(){
		System.out.println("in B");
	}
}

public class TestMain {

	public static void main(String[] args) {
		B b = new A();
		b.xyz();

	}

}
