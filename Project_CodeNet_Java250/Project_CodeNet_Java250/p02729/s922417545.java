

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n, m;

		n = scan.nextInt();
		m = scan.nextInt();

		int n_ans = 0;
		int m_ans = 0;

		if (n <= 1) {
			n_ans = 0;

		} else {
			n_ans = n * (n - 1) / 2;
		}

		if (m <= 1) {
			m_ans = 0;
		} else {
			m_ans = m * (m - 1) / 2;
		}

		System.out.println(n_ans + m_ans);
	}

	/**
	 * 余りを求める。
	 * @param a
	 * @param b
	 * @return 余り。余りがマイナスの時はプラスで返す。
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
	 * @param kisu 基数
	 * @param josu 乗数
	 * @param primeNumMod_0 法 mod値 使わない場合は「0」
	 * @return
	 */
	public static long myPowWithMod(long kisu, long josu, long primeNumMod_0) {

		long ans = 1;

		//乗数が0の場合→1
		if (josu == 0)
			return 1;

		if (primeNumMod_0 == 0) {
			//modを使わないとき

			while (josu > 0) {

				if (josu % 2 == 0) {
					//累乗が偶数の時

					kisu *= kisu;
					josu = josu / 2;
				} else {
					//累乗が奇数の時
					ans *= kisu;
					josu--;
				}
			}

			return ans;

		} else {
			//modを使うとき

			//初めに桁を落とす
			kisu = myMod(kisu, primeNumMod_0);

			while (josu > 0) {

				if (josu % 2 == 0) {
					//累乗が偶数の時

					kisu *= myMod(kisu, primeNumMod_0);
					josu = josu / 2;

				} else {
					//累乗が奇数の時
					ans *= myMod(kisu, primeNumMod_0);
					josu--;

				}
			}

			return myMod(ans, primeNumMod_0);

		}

	}

}
