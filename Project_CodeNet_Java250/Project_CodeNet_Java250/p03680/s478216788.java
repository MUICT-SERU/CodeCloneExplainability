import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i<n; i++ ) {
      a[i] = sc.nextInt();
    }
    int b = 1;
    int c = 0;
    int d = 0;

    while ( b != 2 ) {
      d += 1;
      c = b;
      b = a[b-1];
      if ( b == 0 ) {
        System.out.println(-1);
        return;
      }
      a[c-1] = 0;
    }
    System.out.println(d);
  }
}