import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
    if(A > 9 || B > 9){
      System.out.println("-1");
    }else{
      System.out.printf("%d", A*B);
    }
	}
}