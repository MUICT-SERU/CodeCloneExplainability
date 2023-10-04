import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);


        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());


        int[] test  = new int[1000000];        
        for(int i = 0; i < 2 * M; i++){
            int c = Integer.parseInt(sc.next());
            test[c]++;
        }

        for(int i = 1; i < N+1 ; i++){
            System.out.println(test[i]);
        }

        System.out.println();
    }

}