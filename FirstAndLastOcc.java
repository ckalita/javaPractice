package array;

import java.util.ArrayList;

public class FirstAndLastOcc {

	public static void main(String[] args) {
		int a[]= {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int num = 5;
		method1(a, num);
		method2(a, num);
		//method3(a, num);

	}

	
	private static void method2(int[] a, int num) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		
		System.out.println("First occ is : "+al.indexOf(num));
		System.out.println("last occ is : "+al.lastIndexOf(num));
		
	}

	private static void method1(int[] a, int num) {
		System.out.println("METHOD1");
		int first = -1;
		int last = -1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != num) {
				continue;
			}
			if(first == -1) {
				first = i;
			}
			last = i;
		}
		System.out.println("first occ of "+num+" is : "+first);	
		System.out.println("last occ of "+num+" is : "+last);
	}
	
private static void method3(int[] a, int num) {
		
		int first = -1;
		int last = -1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > num) {
				break;
			}
			if(a[i] == num) {
				if(first == -1) {
					first = i;
				}else {
					last = i;
				}
			}
		}
		if(first !=-1 && last == -1) {
			last = first;
		}
		
		if(first ==-1 && last == -1) {
			System.out.println(num+ " is not present");
		}
		
		if(first !=-1 && last != -1) {
			System.out.println("First occ is : "+first);
			System.out.println("last occ is : "+last);
		}
		
		
		
	}


}
