import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		long b = sc.nextLong();
		// 文字列の入力
		if(a < 10 && b < 10){

			System.out.println( a * b);
		}else{
			System.out.println( - 1 );
		}
		
		
	}
}