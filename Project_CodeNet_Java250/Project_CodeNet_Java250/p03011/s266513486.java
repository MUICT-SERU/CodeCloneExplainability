import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int ab=a+b;
        int ac=a+c;
        int bc=b+c;

        System.out.println(Math.min(Math.min(ab,ac),bc));
    }
}