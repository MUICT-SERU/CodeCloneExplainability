import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int m=sc.nextInt();
      int[]a=new int[m];
      for(int i=0;i<n;i++){
      	int b=sc.nextInt();
        for(int j=0;j<b;j++){
        	a[sc.nextInt()-1]++;
        }
      }
      int count=0;
      for(int i=0;i<m;i++)if(a[i]==n)count++;
      System.out.println(count);
	}
}
