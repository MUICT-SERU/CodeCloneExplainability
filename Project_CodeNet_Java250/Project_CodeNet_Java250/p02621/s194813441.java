
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = a +(a*a)+ (a*a*a);
		System.out.println(b);
		
	}

}