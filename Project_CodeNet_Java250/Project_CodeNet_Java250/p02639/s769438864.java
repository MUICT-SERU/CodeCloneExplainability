import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int[] x = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++){
			x[i] = s.nextInt();
			sum += x[i];
		}
		System.out.println(15-sum);
	}
 
}