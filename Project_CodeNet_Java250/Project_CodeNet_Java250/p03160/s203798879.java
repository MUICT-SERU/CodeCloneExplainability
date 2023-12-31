import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		for(int i=0;i<t;i++)
		{
			arr[i] = sc.nextInt();
		}

		int[] dp = new int[t];

		dp[0] = 0;
		dp[1] = Math.abs(arr[1]-arr[0]);

		for(int i=2;i<t;i++)
		{
			dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));
		}

		System.out.println(dp[t-1]);
	}
}