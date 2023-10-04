import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [][] pass = new int[n][n];
			for(int i = 0; i < m;i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				pass[a][b]++;
				pass[b][a]++;
			}
			
			for(int i = 0; i < n;i++){
				int count = 0;
				for(int j = 0; j < n;j++){
					count += pass[i][j];
				}
				System.out.println(count);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
