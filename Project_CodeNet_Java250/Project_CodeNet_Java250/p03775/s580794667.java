import java.io.*;
import java.util.*;
import java.lang.*;
import static java.lang.System.*;
public class Main
{
public static void  main (String args[])throws Exception
{
Scanner sc=new Scanner(in);
long n=sc.nextLong();
int ans=10000;
for(int i=1;i<=(int)(Math.sqrt(n))+2;i++)
{
	if(n%i==0)
	{
		String a=String.valueOf(i);
		String b=String.valueOf(n/i);
		int c=Math.max(a.length(),b.length());
		if(c<=ans)
		ans=c;

	}
}
out.println(ans);
}
}