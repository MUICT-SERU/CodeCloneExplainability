import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if(B <= C || A >= D){
			System.out.println(0);
		} else {
			System.out.println((B < D ? B : D)-(A > C ? A : C));
		}
	}
}