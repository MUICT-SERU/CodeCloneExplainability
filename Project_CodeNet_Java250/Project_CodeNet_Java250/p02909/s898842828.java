

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		//日ごとに晴れ(Sunny)、くもり(Cloudy)、雨(Rainy)、晴れ
		String s;
		s = scan.next();

		String[] wheathers = {
				"Sunny", "Cloudy", "Rainy"
		};

		for (int i = 0; i < wheathers.length; i++) {
			if (wheathers[i].equals(s)) {
				if (i == 0 || i == 1) {
					System.out.println(wheathers[i + 1]);
					break;
				} else {
					System.out.println(wheathers[0]);
					break;
				}
			}
		}
	}

	/**
	 * 余りを求める。
	 * @param a
	 * @param b
	 * @return 余り。余りがマイナスの時はプラスで返す。ｓ
	 */
	public static long myMod(long a, long b) {
		long ret = 0;

		ret = a % b;

		if (ret < 0) {
			ret += b;
		}

		return ret;
	}

	/**
	 * 乗数を求める ※mod対応
	 * @param a 基数
	 * @param n 乗数
	 * @param primeNumMod 法 mod値 使わない場合は「0」
	 * @return
	 */
	public static long myModPow(long a, long n, long primeNumMod) {

		long ans = 1;

		//乗数が0の場合→1
		if (n == 0)
			return 1;

		if (primeNumMod == 0) {
			//modを使わないとき

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= a;
					n = n / 2;
				} else {
					//累乗が奇数の時
					ans *= a;
					n--;
				}
			}

			return ans;

		} else {
			//modを使うとき

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= myMod(a, primeNumMod);
					n = n / 2;

				} else {
					//累乗が奇数の時
					ans *= myMod(a, primeNumMod);
					n--;

				}
			}

			return myMod(ans, primeNumMod);

		}

	}

}
