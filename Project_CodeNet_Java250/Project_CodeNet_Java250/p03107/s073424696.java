import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int c0 = 0;
        int c1 = 0;
        for(char c : s){
            if(c == '0'){
                c0++;
            }else{
                c1++;
            }
        }
        System.out.println(2*Math.min(c0,c1));
    }
}
