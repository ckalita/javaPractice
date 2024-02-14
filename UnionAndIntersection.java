package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class UnionAndIntersection {
	public static void main(String[] args) {
		int arr1[] = { 7, 1, 5, 2, 3};
        int arr2[] = { 6,4,3, 8, 6, 20, 7 };
        
        System.out.println("Using Hashmap");
        printUnionWithHashMap(arr1,arr2);
        printIntersectionWithHashMap(arr1,arr2);
        System.out.println();

        System.out.println("-----------------");
        System.out.println("Using HashSet");
        printUnionWithHashSet(arr1, arr2);
        printIntersectionWithHashSet(arr1, arr2);
        System.out.println();
        
        System.out.println("-----------------");
        System.out.println("Using List to all");
        printUnion(arr1,arr2);
        
        
	}

	private static void printUnionWithHashSet(int[] arr1, int[] arr2) {

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			hs.add(arr2[i]);
		}
		System.out.println("total ele is : "+hs.size());
		System.out.println("Union is : "+hs);
		
		
	}
	
	private static void printIntersectionWithHashSet(int[] arr1, int[] arr2) {

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		System.out.println("Intersection is : ");
		for (int i = 0; i < arr2.length; i++) {
			if(hs.contains(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
		
		
		
	}
	
	private static void printUnionWithHashMap(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hashMap.put(arr1[i], i);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			hashMap.put(arr2[i], i);
		}
		System.out.println("total ele is : "+hashMap.size());
		System.out.println(hashMap);
		
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			System.out.print(key + " ");
		}
		System.out.println();
	}
	
	private static void printIntersectionWithHashMap(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hashMap.put(arr1[i], i);
		}
		
		System.out.println("intersection is : ");
		for (int i = 0; i < arr2.length; i++) {
			if(hashMap.containsKey(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
		
	}
	
	private static void printUnion(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		System.out.println("total ele is : "+list.size());
		System.out.println(list);
		
	}

}
