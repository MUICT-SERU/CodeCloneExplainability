import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A>=10 || B>=10) {
			System.out.println(-1);
		}else {
		int ans = A * B;
		System.out.println(ans);
	    }
	}
}