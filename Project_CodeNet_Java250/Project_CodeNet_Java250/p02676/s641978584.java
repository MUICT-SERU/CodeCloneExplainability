import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        String S = scanner.next();
        
        if(S.length()<=K){
            System.out.println(S);
        }else{
            System.out.println(S.substring(0,K)+"...");
        }
        
    }
}
