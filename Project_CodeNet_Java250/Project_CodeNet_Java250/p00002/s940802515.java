import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int a,b;

		while(cin.hasNext())
		{
			a=cin.nextInt();
			b=cin.nextInt();
		
			String s = ((Integer)(a+b)).toString();
			System.out.println(s.length());
		}
	}
}