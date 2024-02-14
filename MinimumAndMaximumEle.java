package array;

public class MinimumAndMaximumEle {

	public static void getMinAndMax(int arr[]) {
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("min is : "+min+" and max is : "+max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {5,7,2,4,9,6,1};
		int arr[]= {1000,11,445,1,330,3000};
		getMinAndMax(arr);
	}

}
