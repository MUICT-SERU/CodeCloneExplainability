import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long ans = 0;
		int ans2 = 0;

		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
//		long  k = sc.nextLong();
//		longd = sc.nextInt();
//
//		boolean f = false;
		int[] a = new int[n-1];
		for (int i = 0; i < n-1; i++) {
			a[i] = sc.nextInt();
		}
//		int[] b = new int[n+1];
//		int[] c = new int[n+1];
//		for (int i = 1; i <n+1; i++) {
//			b[i] = sc.nextInt();
//		}
//		for (int i = 1; i <n; i++) {
//			c[i] = sc.nextInt();
//		}

		int chash = 0;

		for(int i = 0; i < n;i++) {
			if(i==0) {
				ans2 += a[i];
			} else if(i==n-1) {
				ans2 += a[i-1];
			} else {
				if(a[i] < a[i-1]) {
					ans2 += a[i];
				} else {
					ans2 += a[i-1];
				}
			}
		}


		System.out.println(ans2);

		sc.close();
	}
}