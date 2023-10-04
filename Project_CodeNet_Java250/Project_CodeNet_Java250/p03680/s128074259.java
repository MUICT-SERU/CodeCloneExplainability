
import java.util.Scanner;
public class Main {

    private static int[] button;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        button = new int[n+1];
        for(int i=1; i<n+1; i++){
            button[i] = sc.nextInt();
        }

        int recent = 1, cnt = 0;
        while (recent != 2){
            recent = button[recent];
            cnt++;
            if(cnt > n){
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(cnt);
    }
}
