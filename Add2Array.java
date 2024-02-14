package array;

import java.util.Arrays;

public class Add2Array {

	public static void main(String[] args) {
		int a[] = {1,4,8};
		//int b[] = {8,4,3}; //991
		int b[] = {4};//232
		
		addArrays(a,b);

	}
	

	private static void addArrays(int[] a, int[] b) {
		int r[] = new int[a.length+1];
		int k=r.length-1;
		int carry = 0, sum =0;
		int size = 1;
		int length = b.length;
		int x=0, y=0;
		for (int i = a.length-1; i >=0; i--) {
			if(size >a.length) {
				x = 0;
			} else {
				x=a[i];
			}
			
			if(size >b.length){
				y = 0;
			}else {
				y=b[length-1];
			}
			
			sum = carry+x+y;
			System.out.println(sum);
			r[k] = sum%10;
			carry = sum/10;
			System.out.println(sum+" : "+r[k]+" : "+carry);
			k--;
			size++;
			length--;
		}
		if(carry >0) {
			r[k] = carry;
		}
		
		System.out.println(Arrays.toString(r));
	}

}
