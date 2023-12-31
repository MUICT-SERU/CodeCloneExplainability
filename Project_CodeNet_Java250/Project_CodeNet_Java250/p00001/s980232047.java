
import java.util.Scanner;

public class Main {
	
	private static int a[];
	private static int N = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		a = new int[N];
		
		//入力
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		//最大値選択法
		for (int i = 0; i < N; i++) {
			int max = i;
			for (int j = i+1; j < N; j++) {
				if(a[j] > a[max]) {
					max = j;
				}
			}
			int t = a[i];
			a[i] = a[max];
			a[max] = t;
		}
		
		//出力
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
	}
}