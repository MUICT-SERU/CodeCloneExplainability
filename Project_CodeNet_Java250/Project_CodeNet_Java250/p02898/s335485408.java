import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
      int k = scn.nextInt();
      int[] a = new int[n];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      int count = 0;
      for(int i=0; i<a.length; ++i){
        if(k<=a[i]){
          count = count+1;
        }
      }
      System.out.println(count);
	}
}