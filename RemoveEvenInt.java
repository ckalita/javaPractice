package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveEvenInt {

	public static void main(String[] args) {
		int a[] = {3,2,4,7,10,6,5}; // {3,7,5};

		//method1(a);
		methodMap(a);
		
		
	}

	private static void methodMap(int[] a) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] %2 !=0) {
				list.add(a[i]);
			}
		}
		
		for (int i : list) {
			System.out.print(i+" ");
		}
		
	}

	private static void method1(int[] a) {
		int oddCount = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] %2 != 0) {
				oddCount++;
			}
		}
		System.out.println(oddCount);
		
		int res[] = new int[oddCount];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] %2 != 0) {
				res[j] = a[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(res));
	}
}
