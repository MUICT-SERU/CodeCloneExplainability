import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigDecimal a = new BigDecimal(sc.next());
		BigDecimal b = new BigDecimal(sc.next());
		System.out.println(a.multiply(b).setScale(0, RoundingMode.DOWN));
	}
}
