import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int count = 0;
    for(int i = 1;i<=n;i++){
      String s = String.valueOf(i);
      if(s.length() % 2 != 0){
        count++;
      }
    }
    System.out.println(count);
  }



}


