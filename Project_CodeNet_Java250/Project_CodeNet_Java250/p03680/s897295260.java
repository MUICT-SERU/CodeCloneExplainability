import java.util.Scanner;

/**
 * Created by suzuki on 17/06/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] check = new int[N];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int index = 0;
        boolean loopFlag = false;
        while (a[index] != 2){
            index = a[index] - 1;
            if(check[index] == 1){
                loopFlag = true;
                break;
            }
            check[index] = 1;
            count++;
        }
        if(loopFlag){
            System.out.println(-1);
        }else {
            System.out.println(count);
        }
    }
}