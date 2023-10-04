
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        //入力
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        boolean[] sign = new boolean[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            sign[i] = false;
        }


        // 出力
        int ans = 0;
        int i = 0;
        while(true){
            if(sign[i]){
                System.out.println(-1);
                break;
            }
            else if(i == 1){
                System.out.println(ans);
                break;
            }
            sign[i] = true;
            i = a[i] - 1;
            ans++;
        }
    }
}