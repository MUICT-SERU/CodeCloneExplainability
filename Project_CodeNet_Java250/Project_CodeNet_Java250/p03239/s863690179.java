import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int[] c = new int[N];
        int[] t = new int[N];
        int min = 1001;
        for(int i=0; i<N; i++) {
            c[i] = Integer.parseInt(sc.next());
            t[i] = Integer.parseInt(sc.next());
            if(T < t[i]) continue;
            if(min > c[i]) min = c[i];
        }
        if(min == 1001) System.out.println("TLE");
        else System.out.println(min);
    }
    
}