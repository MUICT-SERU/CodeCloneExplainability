import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int [n];
      	for(int i = 0; i < n; i++){
        	a[i] = sc.nextInt();
        }
      	int num = 1;
      	int count = 0;
      
      	for(int i = 0; i < n; i++){
        	if(num == 2){
            	System.out.println(count);
              	return;
            }
          	num = a[num-1];
          	count++;
        }
      	System.out.println(-1);
    }
}