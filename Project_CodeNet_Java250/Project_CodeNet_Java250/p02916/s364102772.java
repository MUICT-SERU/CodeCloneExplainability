import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[n-1];
    int num =0;
    int sum = 0;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++){
      sum += sc.nextInt();
    }
    for(int k=0;k<n-1;k++){
      c[k] = sc.nextInt();
    }
    for(int l=0;l<n-1;l++){
      if(a[l]+1 == a[l+1])
      { num = a[l]-1 ;
        sum += c[num];
      }
    }
    System.out.println(sum);
  }
}