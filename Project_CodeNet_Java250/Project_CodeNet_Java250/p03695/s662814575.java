import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		int count3200 = 0;
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < count; i++) {
			int temp = sc.nextInt();
			if (temp >= 1 && temp <= 399) {
				array[0] = 1;
			} else if (temp >= 400 && temp <= 799) {
				array[1] = 1;
			} else if (temp >= 800 && temp <= 1199) {
				array[2] = 1;
			} else if (temp >= 1200 && temp <= 1599) {
				array[3] = 1;
			} else if (temp >= 1600 && temp <= 1999) {
				array[4] = 1;
			} else if (temp >= 2000 && temp <= 2399) {
				array[5] = 1;
			} else if (temp >= 2400 && temp <= 2799) {
				array[6] = 1;
			} else if (temp >= 2800 && temp <= 3199) {
				array[7] = 1;
			} else if (temp >= 3200) {
				count3200++;
			}
		}
		sc.close();
		int countColor = 0;
		for (int i = 0; i < 8; i++) {
			if (array[i] == 1) {
				countColor++;
			}
		}
		
		int small = countColor;
		if (small == 0) {
			small = 1;
		}
		int big = countColor + count3200;
		if (big > 100) {
			big = 100;
		}
		String result = small + " " + big;
		
		System.out.println(result);
	}
}