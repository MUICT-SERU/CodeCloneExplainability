import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String w,t,n;
    int co=0;
        n = "END_OF_TEXT";
           w = s.next();
           while(true){
               t = s.next();
               if(t.equalsIgnoreCase(w))co++;
               else if(t.equals(n))break;
           }
           System.out.println(co);
    }
}
