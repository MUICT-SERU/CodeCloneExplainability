import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int[][] root = new int[N][N];
		for(int i=0;i<M;i++){
			int a =scan.nextInt()-1;
			int b =scan.nextInt()-1;
			root[a][b]++;
			root[b][a]++;
		}

		for(int i=0;i<N;i++){
			int sum=0;
			for(int j=0;j<N;j++){
				sum+=root[i][j];
			}
			System.out.println(sum);
		}
	}

}
