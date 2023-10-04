import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] color = new int[8];
		int free =0;
		int min=0;
		int max=0;

		for (int i=1; i<=n; i++){
			int rate = sc.nextInt();
			if (1 <= rate && rate <= 399){
				color[0]++;
			} else if (400 <= rate && rate <= 799){
				color[1]++;
			} else if (800 <= rate && rate <= 1199){
				color[2]++;
			} else if (1200 <= rate && rate <= 1599){
				color[3]++;
			} else if (1600 <= rate && rate <= 1999){
				color[4]++;
			} else if (2000 <= rate && rate <= 2399){
				color[5]++;
			} else if (2400 <= rate && rate <= 2799){
				color[6]++;
			} else if (2800 <= rate && rate <= 3199){
				color[7]++;
			} else {
				free++;
			}
		}

		for (int i=0; i < color.length; i++){
			if (color[i] > 0 ){
				min++;
			}
		}
		max = min + free;
		if (min == 0){
			min = 1;
		}
		System.out.println(min + " " + max);
	}

}
