import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int min = 0;
		int max = 0;
		if ( a < c){
			min = c;
		}else{
			min = a;
		}
		if ( b < d){
			max = b;
		}else{
			max = d;
		}
		int ans = max - min;
		if ( ans > 0){
			System.out.println(ans);
		}else{
			System.out.println(0);
		}
	}
}
