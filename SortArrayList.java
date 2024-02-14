package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		
		printList(list);
		
		int low = 0;
		int high = list.size()-1;
		quickSort(list,low,high);
		
		System.out.println("After sort");
		printList(list);
	}

	private static void quickSort(List<Integer> list, int low, int high) {
		if(low < high) {
			int pi = partition(list, low, high);
			quickSort(list,low,pi-1);
			quickSort(list,pi+1,high);
		}
	}

	private static int partition(List<Integer> list, int low, int high) {
		int pivot = list.get(low);
		int temp=0;
		int i=-1;
		
		for (int j = 0; j < list.size(); j++) {
			if(list.get(j) >=pivot) {
				i++;
				temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		
		temp = list.get(low);
		list.set(low, list.get(i));
		list.set(i, temp);
		
		return i;
	}

	private static void printList(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
