import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            if (a>=b){
                System.out.println(b + " " + a);
            }else{
                System.out.println(a + " " + b);
            }
        }
    }
}