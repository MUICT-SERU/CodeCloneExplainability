import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	/** ?????? */
	static final BigDecimal capital = BigDecimal.valueOf(100000);

	/** ?????? */
	static final BigDecimal interest = BigDecimal.valueOf(0.05);

	/** ??? */
	static final BigDecimal rate = BigDecimal.valueOf(1).add(interest);

	/**
	 * ????????°???????????°???????????????
	 * ????´???¨???Debt Hell(????????°???)
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input = br.readLine();

		// ????????¶?????\???????????±????????????????????????????????????
		int weeks = Integer.valueOf(input);

		// ?¨??????????????????????????????????????´?
		BigDecimal result = capital;
		for (int i = 0; i < weeks; i++) {
			// ????????????????????????????????????1000???????????????????????????
			result = roundUpLowerThousand(rate.multiply(result).setScale(0, BigDecimal.ROUND_UP));
		}

		System.out.println(result);
	}

	/**
	 * ????§°?????°??????1000???????????????????????????????????´
	 *
	 * @param target ????§°??°???
	 * @return ????????????????????????
	 */
	private static BigDecimal roundUpLowerThousand(BigDecimal target) {
		// ?¨????????????¨??????????????°???1000???
		BigDecimal basisNumber = BigDecimal.valueOf(1000);
		BigDecimal result = target.divide(basisNumber).setScale(0, BigDecimal.ROUND_UP);

		return result.multiply(basisNumber);
	}
}