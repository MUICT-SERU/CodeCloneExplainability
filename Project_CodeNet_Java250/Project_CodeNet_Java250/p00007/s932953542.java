import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double b=100;
        for (int i=0;i<n;i++){
        	b=Math.ceil(b*1.05);
        }
        
        System.out.println((int)b*1000);
   
    }
}