

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CommonClass {
	static int count =0;
	public static void main(String[] args) {
		//q8(); //main(null)
		q1();
		q2();
		q3(); //concurrent modification exception
		q4(); //sum of given pair
		System.out.println(q5());
		q6();
		q7();
		
		//q9();
		
	}

	private static void q9() {
		List<String> list = new ArrayList<String>(Arrays.asList("a", "b","c"));
		
		for(String value: list) {
			if(value.equals("a")) {
				list.remove(value);
			}
		}
		System.out.println(list);
	}

	private static void q8() {
		if(count < 3) {
			count++;
			main(null);
		}else {
			return;
		}
		System.out.println("Hello");
		
	}

	private static void q7() {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Amazon", 30000);
		hm.put("Congo", 40000);
		hm.put("DraiTree", 50000);
		hm.put("Amazon", 60000);
		
		System.out.println("Size of Hm is : "+hm.size());
	}

	private static void q6() {
		final int arr[] = {1, 2, 3, 4, 5}; 
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr[i]*10; 
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}

	}

	private static boolean q5() {
		int a[] = { 4, 5, 1, 3, 1, 3, 5 };
		int k =9;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for(int item : list) {
			if(list.contains(k - item))
				return true;
		}
		return false;

	}

	private static void q4() {
		int a[] = { 4, 5, 1, 3, 1, 3, 5 };
		int k =9;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(hm.containsKey(k-a[i])) {
				count = count + hm.get(k-a[i]);
				System.out.println("pair is : ("+a[i]+","+(k-a[i])+")");
			}
			
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}else {
				hm.put(a[i], 1);
			}
		}
		System.out.println("count is : "+count);
		
		//List list = Arrays.asList(a);
		
		
	}

	private static void q3() {
		List<String> deviceList = new ArrayList<>();
		deviceList.add("tomcat");
		deviceList.add("IBM server");
		System.out.println(deviceList);
		
		for(String name : deviceList){
			//if(name.equals("IBM server")){ //concurrent modification exception
			if(name.equals("tomcat")){
				deviceList.remove(name);
				//deviceList.add("apache"); //concurrent modification exception
			}
		}
		
		for(String name : deviceList){
			System.out.println(name);
		}
	}

	private static void q1() {
		HashSet<Integer> obj = new HashSet<Integer>();
		for(int i=0; i<100; i++){
			obj.add(i);
			obj.remove(i-1);
		}
		System.out.println(obj.size());
	}

	private static int q2() {
		try {
			if(true){
					System.out.println("inside true");
					//return 0;
					//System.exit(0);
			} else {
				System.out.println("before exit");
				System.exit(0);
				System.out.println("after exit");
			}
		} catch (Exception e) {
			System.out.println("inside catch");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("last line");
		return 0;
	}


}
