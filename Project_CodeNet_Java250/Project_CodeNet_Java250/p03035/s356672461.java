import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A >= 13){
            System.out.println(B);
        }else if(6 <= A){
            System.out.println(B/2);
        }else{
            System.out.println(0);
        }
    }
}
