import java.util.*;
public class Main {
//3つの整数の合計
	public static void main(String[] args) {
		int k, s, l, cnt = 0;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		s = sc.nextInt();
		for(int i = 0; i <= k; i++)
		{
			for(int j = 0; j <= k; j++)
			{
				l = s - (i + j);
				if(l >= 0 && l <= k) cnt++;
			}
		}
		System.out.println(cnt);
	}

}