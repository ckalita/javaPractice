
public class MergeDoubleArray {

	public static void main(String[] args) {
		//int[][] d = {{1,4,9, 3}, 
				     //{2,5,11, 6}, 
				     //{7,8,12, 10},
				     //{13,14,15,16}} ; 
		
		int[][] d = {{1, 3}, 
			     {2,6}, 
			     {7,10}};
		int r = d.length;
		int c = d[0].length;
		
		System.out.println("Row: "+r+" :Col: "+c);
		printMatrix(d,r,c); //1 3 2 6 7 10 
		System.out.println();
		printSpiralMatrix(d,r,c);
	}

	private static void printSpiralMatrix(int[][] d, int r, int c) {
		int i, l=0, k=0;
		while(k< r && l<c) {
			for ( i = l; i < c; i++) {
				System.out.print(d[k][i]+" ");
			}
			k++;
			for(i=k;i<r;i++) {
				System.out.print(d[i][c-1]+" ");
			}
			c--;
			if(k<r) {
				for(i=c-1;i>=l;i--) {
					System.out.print(d[r-1][i]+" ");
				}
				r--;
			}
			if(l<c) {
				for(i=r-1;i>=k;i--) {
					System.out.print(d[i][l]+" ");
				}
				l++;
			}
		}
	}

	private static void printMatrix(int[][] d, int r, int c) {
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(d[i][j]+" ");
			}
			
		}
		
	}

}
