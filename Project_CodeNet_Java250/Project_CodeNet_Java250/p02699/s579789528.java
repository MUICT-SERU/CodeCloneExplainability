import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int w = scanner.nextInt();
        if(w >= s){System.out.println("unsafe");}
        else{System.out.println("safe");}

        return;
    }
}