import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int num =0;
        for(int i=0;i<S.length();i++) if(S.charAt(i)==T.charAt(i)) num++;
        System.out.println(num);
    }
}
