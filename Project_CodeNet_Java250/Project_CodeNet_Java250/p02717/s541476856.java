import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int save;

    save = z;
    z = y;
    y = x;
    x = save;

    System.out.println(x + " " + y + " " + z);




  }
}