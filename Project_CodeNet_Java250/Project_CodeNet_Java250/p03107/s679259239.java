import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();

        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '1')
                count1++;
            if(S.charAt(i) == '0')
                count0++;
        }
        System.out.println(2*Math.min(count1,count0));
    }
}