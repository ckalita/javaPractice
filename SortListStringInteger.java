import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListStringInteger {

	public static void main(String[] args) {
		List<String> al =  new ArrayList<>(Arrays.asList("abc", "2","0","4"));
		System.out.println(al);
		
		method1(al);
		method2(al);
	}

	private static void method2(List<String> al) {
		Collections.sort(al);
		System.out.println("Method12 After sort"+al);
	}

	private static void method1(List<String> al) {
		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		System.out.println("Method1 After sort"+al);
	}

}
