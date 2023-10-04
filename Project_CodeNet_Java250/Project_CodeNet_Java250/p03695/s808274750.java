import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		boolean[] rate = new boolean[8];
		Arrays.fill(rate,false);
		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if(a[i] < 400){
				rate[0] = true;
			}else if(a[i] < 800){
				rate[1] = true;
			}else if(a[i] < 1200){
				rate[2] = true;
			}else if(a[i] < 1600){
				rate[3] = true;
			}else if(a[i] < 2000){
				rate[4] = true;
			}else if(a[i] < 2400){
				rate[5] = true;
			}else if(a[i] < 2800){
				rate[6] = true;
			}else if(a[i] < 3200){
				rate[7] = true;
			}else if(a[i] <= 4800){
				max++;
			}
		}
		int c = 0;
		for (boolean r:rate){
			if(r){
				c++;
			}
		}
		max+=c;
		if(c==0 && max>0){
			c = 1;
		}
		System.out.println(c + " " + max);
	}
}