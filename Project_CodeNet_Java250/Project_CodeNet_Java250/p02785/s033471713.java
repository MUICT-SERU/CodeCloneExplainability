import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   Integer a[] = new Integer[N];
   for(int i=0; i<N; i++){
	   a[i] = sc.nextInt();
   }
   long sum = 0;
   Arrays.sort(a, Collections.reverseOrder());
   if(K > N) {K = N;}
   for(int i=0; i<K; i++){
	   a[i] = 0;
   }

   for(int i=0; i<N; i++) {
	   sum += a[i];
   }

   System.out.println(sum);

   }
}
