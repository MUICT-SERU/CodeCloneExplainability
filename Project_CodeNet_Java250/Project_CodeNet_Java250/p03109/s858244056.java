import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().compareTo("2019/04/30") <= 0 ? "Heisei" : "TBD");
    }
}