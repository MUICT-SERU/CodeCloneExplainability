import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt() * scan.nextInt();
		scan.close();
		
		System.out.println(a);
	}
}