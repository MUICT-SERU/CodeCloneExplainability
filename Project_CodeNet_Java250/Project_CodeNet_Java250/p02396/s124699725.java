import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<=10000; i++)
		{		
			int n = scanner.nextInt();
			
			if(n == 0)
			{
				System.out.println("");
				break;
			}
			else
				System.out.println("Case "+i+": "+n);
		}
	}
}