import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i = 1;
      for(i=1;i<=5;i++){
        if(sc.nextInt()==0){
          break;
        }
      }
      System.out.println(i);
    }
}
