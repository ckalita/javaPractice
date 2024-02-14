
public class MatrixProblem {

	public static void main(String[] args) {
		int r=3, c=3;
		int a[][] = new int[r][c];
		formMatrix(r,c);
		
		int mat[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
		System.out.println("Print a matrix");
		//printMatrix(mat);
		
		int mat1[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }, 
                {13, 14, 15, 16 } };
		System.out.println("Print a spiral matrix");
		printSpiralMatrix(mat1);
	}

	private static void printSpiralMatrix(int[][] mat) {
		int i, k=0,l=0;
		int r=4, c=4;
		
		while(k< r && l<c) {
			for (i=l;i<c;i++) {
				System.out.print(mat[k][i]+" ");
			}
			k++;
			for(i=k; i<r;i++) {
				System.out.print(mat[i][c-1]+" ");
			}
			c--;
			if(k<r) {
				for(i=c-1;i>=l;i--) {
					System.out.print(mat[r-1][i]+" ");
				}
				r--;
			}
			if(l<c) {
				for(i=r-1;i>=k;i--) {
					System.out.print(mat[i][l]+" ");
				}
				l++;
			}
		}
		
	}

	private static void printMatrix(int[][] mat) {
		int i = mat.length;
		int j = mat[0].length;
		//System.out.println(i +" : "+j);
		for (i = 0; i < mat.length; i++) {
			for ( j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
		}
		System.out.println();
	}

	private static void formMatrix(int r, int c) {
		int k =1;
		for(int i=0;i<r;i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}

}
