import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = {0,100001};
        boolean flag = true;
        while(m>0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(r < a[0] || a[1] < l){
                System.out.println(0);
                flag = false;
                break;
            }
            if(a[0] < l){
                a[0] = l;
            }
            if(r < a[1]){
                a[1] = r;
            }
            m--;
        }

        if(flag){
            System.out.println(a[1]-a[0]+1);
        }
    }
}
