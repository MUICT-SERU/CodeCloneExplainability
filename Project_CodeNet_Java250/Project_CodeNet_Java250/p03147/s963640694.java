
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ABC116_A();
		// ABC116_B();
		ABC116_C();
		// ABC116_D();
	}

	private static void ABC116_A() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();
			lineCA = scanner.nextInt();

			int result = lineAB * lineBC / 2;
			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC116_B() {
		Scanner scanner = null;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numS = scanner.nextInt();

			int wkResult = 0;

			List<Integer> wkList = new ArrayList<Integer>();
			int cnt = 0;
			while (true) {
				if (cnt != 0) {
					wkResult = isResultNum(wkList.get(cnt - 1));
					if (wkList.contains(wkResult)) {
						cnt++;
						break;
					}
					wkList.add(wkResult);
				} else {
					wkResult = numS;
					wkList.add(numS);
				}
				cnt++;
			}
			System.out.println(cnt);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static int isResultNum(int numS) {
		if (numS % 2 == 0) {
			return numS / 2;
		} else {
			return 3 * numS + 1;
		}
	}

	private static boolean isNotExit(int[] arrayH) {
		for (int i = 0; i < arrayH.length; i++) {
			if (arrayH[i] != 0) {
				return true;
			}
		}
		return false;
	}

	private static void ABC116_C() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			int[] arrayH = new int[numN];
			for (int i = 0; i < arrayH.length; i++) {
				arrayH[i] = scanner.nextInt();
			}

			int cnt = 0;
			while (isNotExit(arrayH)) {
				cnt++;
				boolean notZAeroCnt = false;
				for (int i = 0; i < arrayH.length; i++) {
					if (arrayH[i] != 0) {
						arrayH[i]--;
						notZAeroCnt = true;
					} else {
						if (notZAeroCnt) {
							break;
						}
					}

				}
			}
			System.out.println(cnt);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC116_D() {
		Scanner scanner = null;
		String numT = "";
		String numX = "";

		try {
			scanner = new Scanner(System.in);
			numT = scanner.next();
			numX = scanner.next();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}