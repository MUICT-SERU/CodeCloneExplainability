import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

            if(B/K*K>=A){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }         
	}
}
