package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_HighestFromList {
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(2,1,3,4,7,5);
		
		methodQS(li);
		method1(li);
		method2(li);
		methodStream(li);
		
	}

	private static void methodQS(List<Integer> li) {
		System.out.println("Before sort list is : "+li);
		int low = 0;
		int high = li.size();
		quickSort(li, low, high);
		System.out.println("Sorted list is : "+li);
		
	}
	
	private static void quickSort(List<Integer> list, int low, int high) {
		
		if(low < high) {
			int pi = partition(list, low, high);
			quickSort(list, low, pi-1);
			quickSort(list, pi+1, high);
		}
	}
	
	private static int partition(List<Integer> list, int low, int high) {
		int pivot = list.get(low);
		int i=-1;
		int temp =0;
		
		for (int j = 0; j < list.size(); j++) {
			
			if(pivot >= list.get(j)) {
				i++;	
				temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		
		temp = list.get(i);
		list.set(i, list.get(low));
		list.set(low, temp);
		
		return i;
	}

	private static void methodStream(List<Integer> li) {
		int methodStream = li.stream().max(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
				
			}
		}).get();
		//System.out.println("method1 - List is  : "+li);
		System.out.println("methodStream - highest is: "+methodStream);
	}

	private static void method1(List<Integer> li) {
		Collections.sort(li);
		System.out.println("method1 - List is  : "+li);
		System.out.println("method1 - highest is: "+li.get(li.size()-1));
	}
	
	private static void method2(List<Integer> li) {
		Collections.sort(li, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		System.out.println("method2 - List is  : "+li);
		System.out.println("method2 - highest is: "+li.get(0));
	}

}
