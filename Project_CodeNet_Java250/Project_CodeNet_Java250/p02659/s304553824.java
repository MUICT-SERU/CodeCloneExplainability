import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();

        BigDecimal result = a.multiply(b);

        System.out.println(result.longValue());
    }
}
