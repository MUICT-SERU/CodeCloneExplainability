import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long a,b;
		a = sc.nextLong();
		b = sc.nextLong();
		System.out.printf("%d %d %.6f\n",a/b,a%b,(double)a/(double)b);
		
	}
}