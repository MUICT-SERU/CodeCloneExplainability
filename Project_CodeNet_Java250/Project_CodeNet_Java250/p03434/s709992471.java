import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    int alice = 0;
    Arrays.sort(a);
    reverse(a);
    for(int i = 0; i < n; i++){
      alice += (i % 2 == 0) ? a[i] : -a[i];
    }
    System.out.println(alice);
  }
  
  public static int[] reverse(int[] array){
    for(int i = 0; i < array.length/2; i++){
      int tmp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = tmp;
    }
    return array;
  }
}