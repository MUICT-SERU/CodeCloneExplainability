import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main (String...args) {
        Scanner sc = new Scanner(System.in); int a = sc.nextInt(); int b = sc.nextInt(); int answer = -1;
        for (int i=b*10; i<(b+1)*10; i++) if (i*8/100==a){ answer = i; break;}
        System.out.println(answer);}
}