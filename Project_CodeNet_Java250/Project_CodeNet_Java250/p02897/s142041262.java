import java.util.*;

public class Main {

  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();
  	 System.out.println((i + (i % 2 == 1 ? 1 : 0)) / 2d / i);
    
  }
  
}
  