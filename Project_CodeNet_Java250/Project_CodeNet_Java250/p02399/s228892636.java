import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d,r = 0;
        double f = 0;
        
        d=a/b;
            
        r=a%b;
            
        f=(double)a/b;
        
        System.out.println(d);
        System.out.println(r);
        System.out.printf("%.5f\n",f);
        
    }
    
    
}
