import java.util.*;
/**
 * Created by 卢嘉昊 on 2017/8/12.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int Alice = B-A;
        int Bob = D-C;
        int res = 0;
        if(A<C){
            if(B<C) res = 0;
            else if(B>D) res = Bob;
            else res = B-C;
        }else if(A == C){
            res = Alice < Bob ? Alice : Bob;
        }else{
            if(A>=D) res = 0;
            else if(B>D) res = D-A;
            else res = B-A;
        }
        System.out.println(res);
    }
}