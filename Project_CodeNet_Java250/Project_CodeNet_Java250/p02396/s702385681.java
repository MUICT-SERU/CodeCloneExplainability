import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i == i){
			int X = sc.nextInt();
			if(X == 0)
				break;
			System.out.println("Case " + i +": "+ X);
			i++;
		}
		sc.close();
	}
}