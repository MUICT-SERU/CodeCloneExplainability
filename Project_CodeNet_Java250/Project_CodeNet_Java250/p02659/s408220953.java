import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      
        BigDecimal A = new BigDecimal(in.next());
        BigDecimal B = new BigDecimal(in.next());
		BigDecimal a = A.multiply(B);
        long answer = a.longValue();
        System.out.println(answer);
    }
}