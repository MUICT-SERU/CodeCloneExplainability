import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double r = Double.parseDouble(sc.next());
        
        System.out.println(r*2*Math.PI);
    }
}