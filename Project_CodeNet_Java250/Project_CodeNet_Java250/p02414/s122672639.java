import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		
		for(int ar = 0; ar < n; ar++) {
			for(int ac = 0; ac < m; ac++) {
				a[ar][ac] = sc.nextInt();
			}
		}
		
		for(int br = 0; br < m; br++) {
			for(int bc = 0; bc < l; bc++) {
				b[br][bc] = sc.nextInt();
			}
		}
		
		for(int cr = 0; cr < n; cr++) {
			for(int cc = 0; cc < l; cc++) {
				long i = 0;
				for(int ca = 0; ca < m; ca++) {
					i += a[cr][ca] * b[ca][cc];
				}
				if(cc != 0) {
					System.out.print(" ");
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

