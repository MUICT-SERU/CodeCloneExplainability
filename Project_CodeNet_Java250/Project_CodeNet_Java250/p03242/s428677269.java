import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a = N/100;
		int b = (N-a*100)/10;
		int c = N-a*100-b*10;
		if (a==1) {
			a=9;
		} else if(a==9) {
			a=1;
		}
		if (b==1) {
			b=9;
		} else if(b==9) {
			b=1;
		}
		if (c==1) {
			c=9;
		} else if(c==9) {
			c=1;
		}
		System.out.println(a*100 + b*10 + c);
	}
}
