
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        while (h + w > 0) {
            
            
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
            
            
            
            h = scanner.nextInt();
            w = scanner.nextInt();
        }
    }
}

