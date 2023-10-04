import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int m,n;
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[][] road=new int[n+1][n+1];
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			road[a][b]++;
			road[b][a]++;
		}
		for(int i=1;i<=n;i++){
			int count=0;
			for(int j=1;j<=n;j++){
				if(road[i][j]>0)count+=road[i][j];
			}
			System.out.println(count);
		}
		
	}
}
