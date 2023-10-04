import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//???, ?????\??????????????????
		int n = sc.nextInt();
		int m = sc.nextInt();
		int matrixA[][] = new int[m][n];
		int vectorB[] = new int[m];
		int vectorC[] = new int[n];
		
		//??????A????????????????´?
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrixA[j][i] = sc.nextInt();
			}
		}
		
		//????????????b????????????????´?
		for(int j = 0; j < m; j++) {
			vectorB[j] = sc.nextInt();
		}
		
		//????????????c????????????????´?
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				vectorC[i] = vectorC[i] + matrixA[j][i] * vectorB[j];
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(vectorC[i]);
		}
	}
}