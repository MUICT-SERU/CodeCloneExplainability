import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int min = 0, max = 0;
		boolean[] flgs = new boolean[8];
		for(int i = 0; i < flgs.length; i++) {
			flgs[i] = false;
		}
		for(int i = 0; i < n; i++) {
			int score = scan.nextInt();
			if(3200 <= score) {
				max++;
			} else {
				for(int j=0; j<flgs.length; j++) {
					if(400*j <= score && score < 400*(j+1)) {
						flgs[j] = true;
					}
				}
			}
		}
		scan.close();
		for(int i=0; i<flgs.length; i++) {
			if(flgs[i]) {
				min++;
			}
		}
		max += min;
		if(max != 0 && min == 0) {
			min = 1;
		}
		System.out.println(min+" "+max);
	}

}