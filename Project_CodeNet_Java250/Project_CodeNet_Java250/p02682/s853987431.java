import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int k=scan.nextInt();
		if(k<=a) {
			System.out.println(k);
		}
		else if(k<=a+b) {
			System.out.println((a*1));
		}
		else {
			System.out.println((a*1)+(-1*(k-a-b)));
		}
	}

}
