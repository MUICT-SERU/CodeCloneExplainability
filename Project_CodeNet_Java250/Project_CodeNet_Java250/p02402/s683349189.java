
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n = 0;
		long sum = 0;

		// ????????£????????¨?????????
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// ??\???????????°????????°????????¶
		if (n <= 0 || n > 10000) {
			sc.close();
			return;
		}

		// ??\???????????°????????°??????????????????
		int[] a_i = new int[n];

		// n????????????????????\?????????????????¶?????????????????????break???
		boolean a = false;
		for (int i = 0; i < a_i.length; i++) {
			a_i[i] = sc.nextInt();
			if (a_i[i] > 1000000 || a_i[i] < -1000000)
				a = true;
		}
		sc.close();
		if (a)
			return;

		int max = a_i[0]; // ??¨?????????????????§??????a_i[0]????¨???????????????°max?????£??\
		int min = a_i[0]; // ??¨????????????????°???????a_i[0]????¨???????????????°min?????£??\
		// ?????§?????¨????°????????±???????
		for (int i = 0; i < a_i.length; i++) {
			if (max < a_i[i]) {
				max = a_i[i];
			}
			if (min > a_i[i]) {
				min = a_i[i];
			}

		}
		// ????¨????????±???????
		for (int value : a_i) {
			sum = sum + value;
		}

		// ????????????
		System.out.println(min + " " + max + " " + sum);

		// ????????£???????????????
		sc.close();
	}
}