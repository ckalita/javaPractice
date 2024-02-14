package array;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElein3Arrays {

	public static void main(String[] args) {
		
		 int a[] = {1, 5, 10, 20, 40, 80}; 
		 int b[] = {6, 7,20, 80, 100}; 
		 int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		//int a[] = {3,3,3};
		//int b[] = {3,3,3};
		//int c[] = {3,3,3};
		findCommon(a,b,c);
	}

	private static void findCommon(int[] a, int[] b, int[] c) {
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			if(hs.contains(b[i])) {
				hs1.add(b[i]);
			}
		}
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println("common ele are : ");
		for (int i = 0; i < c.length; i++) {
			if(hs1.contains(c[i])) {
				System.out.print(" "+c[i]);
			}
		}
	}

}
