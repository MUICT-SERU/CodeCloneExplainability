import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a + b == 3){
        	System.out.println(3);}
        else if(a + b == 5) {
            System.out.println(1);}
       else {
            System.out.println(2);
       }
    }
}