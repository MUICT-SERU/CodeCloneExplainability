import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		//int b[][]=new int[n][n];
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=a[i]*(sum-a[i]);
		}
		System.out.println(ans/2);

	}
}
