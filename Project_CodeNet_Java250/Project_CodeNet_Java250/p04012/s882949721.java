import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;
        String str = "";


        String s1 = sc.next();
        char[] c1 = s1.toCharArray();
        char c;
        int[] test  = new int[1000];
        for( int k=0; k<s1.length(); k++){

                c = c1[k];
                test[c]++;
         
        }
        int flag = 0;
        for( int k=0; k<1000; k++){

                
                if(test[k] % 2 == 1) flag++;
         
        }
        


        if(flag==0)System.out.print("Yes");
        else    System.out.print("No");
        System.out.println();
    }

}