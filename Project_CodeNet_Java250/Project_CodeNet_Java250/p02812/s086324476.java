import java.util.Scanner;

public class Main {
 
    public static void main( String[] args ) {
 
        Scanner sc = new Scanner( System.in );
      
        int n = sc.nextInt();  
        String s = sc.next(); 
      
        String replaceStr = s.replaceAll( "ABC", "" );
        System.out.println( ( n - replaceStr.length() ) / 3 );
    }
}