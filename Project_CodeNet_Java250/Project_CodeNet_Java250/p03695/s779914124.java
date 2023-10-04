import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] c = new int [9];
        for(int i=0; i<N; i++){
            int tmp = sc.nextInt()/400;
            if(tmp>8)tmp=8;
            c[tmp]++;
        }
        int max,min=0;
        for(int i=0; i<8; i++){
            if(c[i]!=0)min++;
        }
        if(min==0){
            min=1;
            max=c[8];
        }else{
            max=min+c[8];
        }
        System.out.println(min+" "+max);
    }
}