import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int sqrtN=(int)Math.sqrt(N);
        int result=0;
        for(int i=1;i<sqrtN+1;i++){
            if(N%i==0){
                result=(int)Math.log10(N/i)+1;
            }
        }
        System.out.println(result);
        return;


    }
}
