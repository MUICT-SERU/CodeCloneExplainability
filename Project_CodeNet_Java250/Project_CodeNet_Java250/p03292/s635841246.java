import java.util.*;

public class Main{
  public static void main(String[] args){
    int[] a = new int[3];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<3; i++){
      a[i] = Integer.parseInt(sc.next());
    }

    Arrays.sort(a);
    System.out.println(a[2]-a[0]);
  }
}