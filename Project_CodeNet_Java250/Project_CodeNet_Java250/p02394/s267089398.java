import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         
        int W = scan.nextInt();
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();
        if ((x-r) < 0 || W < (x+r) || (y-r) < 0 || H < (y+r)){
        	System.out.println("No");
        	return;
        }
        System.out.println("Yes");
    }
}