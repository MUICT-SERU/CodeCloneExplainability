import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        boolean [] boo = new boolean[N];
        for(int i=0; i<N; i++)A[i] = sc.nextInt()-1;
        int ans=0;
        int tmp = 0;
        while(tmp!=1){
            tmp = A[tmp];
            if(boo[tmp]){
                ans=-1;
                break;
            }
            boo[tmp]=true;
            ans++;
        }
        System.out.println(ans);
    }
}
