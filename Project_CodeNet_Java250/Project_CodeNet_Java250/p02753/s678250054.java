import java.util.*;
class Main{
    public static void main(String[] args){
      	Scanner sc=new Scanner(System.in);
        String S=sc.next();
      	boolean f= (S.charAt(0)==S.charAt(1))&&(S.charAt(2)==S.charAt(1));
      	System.out.println(f?"No":"Yes");
    }
}