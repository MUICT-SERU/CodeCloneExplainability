import java.util.Scanner;
	public class Main
		{ public static void main(String[] args)
			{   
			    Scanner scanner = new Scanner(System.in);
				int N = scanner.nextInt();
				int[] a = new int[N];
				int[] flg = new int [8];
				
				flg[0] = 0;
				flg[1] = 0;
				flg[2] = 0;
				flg[3] = 0;
				flg[4] = 0;
				flg[5] = 0;
				flg[6] = 0;
				flg[7] = 0;
				int count = 0;
				int min = 0;
				int max = 0;
				
				for (int i = 0; i < N; i++) {
				    a[i] = scanner.nextInt();
				    if (1 <= a[i] && a[i] <= 399) {
				        flg[0] = 1;
				    }
				    if (400 <= a[i] && a[i] <= 799) {
				        flg[1] = 1;
				    }
				    if (800 <= a[i] && a[i] <= 1199) {
				        flg[2] = 1;
				    }
				    if (1200 <= a[i] && a[i] <= 1599) {
				        flg[3] = 1;
				    }
				    if (1600 <= a[i] && a[i] <= 1999) {
				        flg[4] = 1;
				    }
				    if (2000 <= a[i] && a[i] <= 2399) {
				        flg[5] = 1;
				    }
				    if (2400 <= a[i] && a[i] <= 2799) {
				        flg[6] = 1;
				    }
				    if (2800 <= a[i] && a[i] <= 3199) {
				        flg[7] = 1;
				    }
				    if (3200 <= a[i]) {
				        count++;
				    }
				}
				
				for (int i = 0; i < 8; i++) {
				    if (flg[i] == 1) {
				        min ++;
				    } 
				} 
				
				
				max = min + count;
				if (min == 0) {
				    min = 1;
				}
				
				System.out.print(min + " " + max);
		}
		}