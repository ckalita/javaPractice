package array;

import java.util.ArrayList;
import java.util.List;

public class SortArraylist {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(5);
		
		System.out.println("Befort sort");
		printList(al);
		
		int low = 0;
		int high = al.size()-1;
		quickSort(al,low,high);
		
		System.out.println("After sort");
		printList(al);
	}

	private static void quickSort(List<Integer> al, int low, int high) {
		if(low < high) {
			int pi = partition(al, low, high);
			quickSort(al,low,pi-1);
			quickSort(al,pi+1,high);
		}
	}

	private static int partition(List<Integer> al, int low, int high) {
		int pivot = al.get(low);
		int i = -1, temp;
		for (int j = 0; j < al.size(); j++) {
			if(al.get(j) >= pivot) {
				i++;
				temp = al.get(i);
				al.set(i, al.get(j));
				al.set(j, temp);
			}
		}
		
		temp = al.get(low);
		al.set(low, al.get(i));
		al.set(i, temp);
		
		return i;
	}

	private static void printList(List<Integer> al) {
		for (int i : al) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
