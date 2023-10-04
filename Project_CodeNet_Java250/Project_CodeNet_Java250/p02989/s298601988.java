import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] d = new int[N];
        
        for(int i = 0; i < N; i++) {
            d[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(d);
        
        int ans = 0;
        if(d[N/2-1] == d[N/2]) {
            System.out.println(ans);
        }else {
            System.out.println(d[N/2] - d[N/2-1]);
        }
    }
}