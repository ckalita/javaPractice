import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {2,1,5,3,4};
		System.out.println("Before sort : "+Arrays.toString(a));
		int low = 0;
		int high = a.length;
		quickSort(a, low, high);
		System.out.println("After sort : "+Arrays.toString(a));
		
		List<Integer> list = Arrays.asList(2,1,5,3,4);
		sortList(list);
		
	}

	private static void sortList(List<Integer> list) {
		System.out.println("Before sort list : "+list);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("After sort list : "+list);
	}

	private static void quickSort(int[] a, int low, int high) {
		if(low < high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = -1;
		int temp = 0;
		for (int j = 0; j < a.length; j++) {
			if(pivot <= a[j]) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
		temp = a[i];
		a[i] = a[low];
		a[low] = temp;
		return i;
	}

}
