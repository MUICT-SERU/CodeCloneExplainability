import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=scan.nextInt();
	int S=a<=c?c:a;
	int F=b<=d?b:d;
	System.out.println(S<F?F-S:0);
}
}