package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountFrequency {

	private static final Object Integer = null;

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,4,4,4,5};
		int x = 3;
		//countFrequencyOfOneInt(arr,x);
		countFrequency(arr,x);
	}

	private static void countFrequency(int[] arr, int x) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!hm.containsKey(arr[i])) { 
				hm.put(arr[i], 1);
			}else {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		System.out.println(hm);
		
		for(Entry<Integer, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey()+" : "+ map.getValue());
		}
		
		for(Entry<Integer, Integer> map : hm.entrySet()) {
			if(map.getKey() == x)
				System.out.println("Occurence of "+ x+" is :"+ map.getValue());
		}
		
	}

	private static void countFrequencyOfOneInt(int arr[], int x) {
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			if(x==arr[i]) {
				count++;
			}
		}
		System.out.println("Occurence of "+x+" is : "+count);
	}
	
	

}
