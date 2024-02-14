import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

 interface AddFunc{
	
	int add(int a, int b);
 }

public class Java8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,5,3,4);

		int max = list.stream().max(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		}).get();
		System.out.println("Max ele is : "+max);
		
		System.out.println("Skipping 3 ele : ");
		list.stream().skip(3).forEach(x -> System.out.println(x));
		
		System.out.println("Skipping  3 : ");
		list.stream().filter(x -> x!=3).forEach(System.out::println);
		
		
		AddFunc sum = (a,b) -> a+b;
		System.out.println(sum.add(2,3));

	}

}
