import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		for( int i=0; i<1; i++ ){
			if( A==B && B!=C ){
				System.out.println("Yes");
				break;
			}
			if( A!=B && B==C ){
				System.out.println("Yes");
				break;
			}
			if( A==C && B!=C ){
				System.out.println("Yes");
				break;
			}
			if( i==0 ){
				System.out.println("No");
			}
		}
	}
}