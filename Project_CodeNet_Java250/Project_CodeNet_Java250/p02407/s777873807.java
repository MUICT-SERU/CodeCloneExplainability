import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<n/2; i++)
		{
			int buf = a[i];
			a[i] = a[n-i-1] ;
			a[n-i-1]  = buf;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+(i==n-1?"\n":" "));
		}
		
	}
}