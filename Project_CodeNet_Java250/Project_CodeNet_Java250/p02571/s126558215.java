
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int min=1000000000;
		int sum=0;
		for(int i=0;i<s.length()-(t.length()-1);i++)
		{
			sum=0;
			for(int j=0;j<t.length();j++)
			{
				if(s.charAt(i+j)!=t.charAt(j)) sum++;
			}
			//System.out.println(sum);
			min=Math.min(min, sum);
			
		}
		System.out.println(min);
	}
}
