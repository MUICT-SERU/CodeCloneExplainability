import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
        int A = 1;
		int sum = 0;
		
       for(int i=0;i<3;i++){
         A=A*a;
         sum+=A;
        }
      
		System.out.println(sum);
	}
}