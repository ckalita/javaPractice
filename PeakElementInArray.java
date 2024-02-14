package array;

//peakelement in a array refer to the element which is greater than the adjacent element

public class PeakElementInArray {
	public static int peekElement(int array[], int n) {

		//if array has 1 element then return the same
		if(n == 1) {
			return array[0];
		}if(array[0] >=array[1]) { //if the 1st element is greater than the 2nd element then return 1st element
			return array[0];
		}if(array[n-2]<array[n-1]) {  //if the last element is greater than the 2nd last element then return last element
			return array[n-1];
		}
		//otherwise compare each element with both previous and next adjacent element
		for (int i=1; i<n-1; i++) { 
			if(array[i] >=array[i+1] &&
					array[i] >=array[i-1]) {
				return array[i];
			}
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		//int array[] = {5,2,3,4,8,6};  //output 5
		//int array[] = {5,2,3,4,8,6,7};  //output 7
		int array[] = {2,3,4,8,6};  //output 8
		int size = array.length;
		int peakElement = peekElement(array, size);
		System.out.println("pealelement is : "+peakElement);
				
	}

}
