import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      String str = sc.next();
      if(str.length() > num){
        str = str.substring(0, num) + "...";
      }
      System.out.println(str);
    }
}