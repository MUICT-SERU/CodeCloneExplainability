import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int time = 0;
		
		if(B<C)
		{
			time = 0;
		}
		else if(D<A)
		{
			time = 0;
		}
		else if(A<C&&D<B)
		{
			time = D-C;
		}
		else if(C<A&&B<D)
		{
			time = B-A;
		}
		else if(A<C)
		{
			time=B-C;
		}
		else if(C<A)
		{
			time=D-A;
		}
		else if(C==A)
		{
			time = B<D ?(B-A):(D-C); 
		}

		System.out.println(time);

	}

}
