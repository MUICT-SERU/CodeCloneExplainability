import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] a = new char[n];
    String s = sc.next();
    int count = 1;

    for(int i=0 ; i<n ; i++){
      a[i] = s.charAt(i);
    }

    for(int i=0 ; i<n-1 ; i++){
      if(a[i]==a[i+1]){
        continue;
      }else{
        count++;
      }
    }
    System.out.println(count);
  }
}
