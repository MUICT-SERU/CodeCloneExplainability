import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a/b;
		
		int r=a-b*d;
		double f=1.0 * a/b;
		
		System.out.println(d+" "+r+" "+(String.format("%.8f", f)));
	}

}

