import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>=13) {
			System.out.println(b);
		}
		else if(a<13&&a>=6) {
			System.out.println(b/2);
		}
		else if(a<6) {
			System.out.println(0);
		}
	}
}
