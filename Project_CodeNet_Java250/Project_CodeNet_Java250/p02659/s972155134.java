import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next());
        BigDecimal B = new BigDecimal(sc.next());
        System.out.println((A.multiply(B).toString().split("\\."))[0]);
    }
}