import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();

   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i] =sc.nextInt();

   Arrays.sort(a);
   int count =1;
   int tmp =a[0];
   for(int i=1;i<N;i++)
   {
     if(tmp<a[i])
     {
       tmp = a[i];
       count++;
     }
   }
   System.out.println(count);
 }
}