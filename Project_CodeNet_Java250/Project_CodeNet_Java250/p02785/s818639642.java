import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Long ans = 0l;
        
        HashSet hoge =new HashSet<Integer>(); 
        ArrayList Zero =new ArrayList<Integer>(); 
        for(int i =0;i<N;i++){
                //hoge.add(sc.nextInt());
                Zero.add(sc.nextLong());
        }
        Collections.sort(Zero);
        int count =0;
        for(int i=N-1;0<K&& i>-1;i--){
            Zero.set(i, 0l);
            K--;
        }
        for(int i =0;i<N;i++){
            ans =ans+(Long)Zero.get(i);
        }
        
        

/*         String abc = "abcdefghijklmnopqrstuvwxyz";
        Long alf = 26l;
        Long N = sc.nextLong();
        String ans = "";

        for(;N>0;){
            Long Num = N-1;
            int tStr = (int)(Num%alf);
            ans = abc.substring(tStr,tStr+1)+ans;
            N =  Num/alf;
        } */
        System.out.println(ans);
    }
}
    


    