
public class TestExactly {
	int i=0;
	
	public static void main(String[] args) {
		int i=1;
		i = change_i(i);
		System.out.println(i);

	}

	private static int change_i(int i) {
		i=2;
		i *=2;
		return i;
	}

}
