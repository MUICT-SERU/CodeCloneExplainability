import java.util.*;
public class Main{

	public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt(),ar[]=new int[a];
      for(int i=0;i<a-1;i++){
      	int p=sc.nextInt();
        ar[p-1]++;
      }
      for(int i=0;i<a;i++){
      System.out.println(ar[i]);
      }
    
    
    }


}