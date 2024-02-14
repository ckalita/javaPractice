package String;

public class CommonPrefix {

	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks",
	            "geek", "geezer"};
	        int n = arr.length;
	 
	        String ans = commonPrefix(arr, n);
	        if(ans.length() > 0) {
	        	System.out.println("prefix is : "+ans);
	        }else {
	        	System.out.println("no prefix");
	        }
	}

	private static String commonPrefix(String[] arr, int n) {
		int minlength = FindSmallerWord(arr,n);
		System.out.println("SmallerWord length is : "+minlength);
		String result = "";
		char currentChar;
		for (int i = 0; i < minlength; i++) {
			currentChar = arr[0].charAt(i);
			System.out.println("currentChar : "+currentChar);
			for(int j=1; j<arr.length; j++) {
				if(arr[j].charAt(i) != currentChar) {
					return result;
				}
			}
			result = result+currentChar;
		}
		return result;
	}

	private static int FindSmallerWord(String[] arr, int n) {
		int minlength = arr[0].length();
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].length() < minlength) {
				minlength = arr[i].length();
			}
		}
		return minlength;
	}

}
