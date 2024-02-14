import java.util.Arrays;

public class ChangeProgramCount {

	public static void main(String[] args) {
		int coin[] = {1,2,3};
		int num = 5; //{1,1,1,1,1},{1,1,1,2},{1,1,3},{1,2,2},{2,3}
		changeProgam(coin,5);
	}

	private static void changeProgam(int[] coin, int n) {
		int a[][] = new int[coin.length+1][n+1];
		int i =0, j=0;
		for ( i = 0; i < coin.length; i++) {
			for ( j = 0; j < n; j++) {
				if(j==0) {
					a[i][0]=1;
				}
				if(coin[i] > j) {
					a[i][j] = a[i-1][j];
				}else {
					a[i][j] = a[i-1][j]+a[i][j-coin[i]];
				}
			}
		}
		System.out.println(i+" "+j);
		
		
	}

}
