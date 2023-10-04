import java.util.*;

//update 2019/12/13

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int n = nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = nextInt();
    }

    int cnt = 1;

    boolean ok = false;

    for(int i=0;i<n;i++){

      if(a[i]==1){
        ok = true;
      }

      if(a[i]==cnt){
        cnt++;
      }
    }

    cnt--; //砕かない数

    int ans = n - cnt; //砕く数

    if(ok){
      System.out.println(ans);
    }
    else{
      System.out.println("-1");
    }


  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char aaa){
    return aaa - 48;
  }

  public static int maxInt(int[] a,int lng){
    int max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static int minInt(int[] a,int lng){
    int min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

  public static long maxLong(long[] a,int lng){
    long max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static long minLong(long[] a,int lng){
    long min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

}
