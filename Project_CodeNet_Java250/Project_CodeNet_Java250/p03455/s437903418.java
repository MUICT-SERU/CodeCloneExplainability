import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt(), B = scn.nextInt();
		System.out.println((A*B)%2==0?"Even":"Odd");
	}

}
