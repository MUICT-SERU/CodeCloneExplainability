/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int k;
		String s;
		k = ulaz.nextInt();
		s = ulaz.next();
		
		if (s.length() <= k)
		    System.out.println(s);
		else
		{
		    for (int i = 0; i < k; i++)
		        System.out.print(s.charAt(i));
		    System.out.print("...");
		}
	}
}
