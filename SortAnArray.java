import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAnArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(3);		
		list.add(4);
		list.add(2);
		
		System.out.println("before sort : "+list);
		int low = 0;
		int high = list.size();
		//quickSort(list, low, high);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}});
		System.out.println("After sort : "+list);
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
		int i = -1;
		int temp = 0;
		
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

}
