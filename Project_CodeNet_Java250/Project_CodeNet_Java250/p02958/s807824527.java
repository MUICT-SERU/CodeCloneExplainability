import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b[] = new int[a];

        int count = 0;

        for (int i = 0; i < a; i++) {
            b[i] = s.nextInt();
            
            if (b[i] != (i+1)) {
                count++;
            }
        }

        if (count <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}