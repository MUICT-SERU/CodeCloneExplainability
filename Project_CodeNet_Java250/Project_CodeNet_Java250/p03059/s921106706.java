import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=sc.nextInt();
        int sum=0;

        for(int i=1; a*i<=t; i++){
            sum+=b;
        }
        System.out.println(sum);
        sc.close();
    }
}