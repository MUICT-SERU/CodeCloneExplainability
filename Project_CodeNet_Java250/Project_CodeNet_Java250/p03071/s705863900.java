import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = 0;
		if(a > b){
		    result = a + a - 1;
		}else if(a < b){
		    result = b + b - 1;
		}else{
		    result = a + b;
		}
		
		// 出力
        System.out.println(result);
	}
}