import java.util.Scanner;

public class Main{
  static int k, s;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    k = sc.nextInt();
    s = sc.nextInt();

    long count = 0;
    for(int x = 0; x <= k; x++){
      if(x > s){
        continue;
      }
      for(int y = 0; y <= k; y++){
        int z = s - (x + y);
        if(z >= 0 && z <= k){
          ++count;
        }
      }
    }

    System.out.println(count);
  }
}
