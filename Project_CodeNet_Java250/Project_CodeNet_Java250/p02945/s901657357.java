import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a + b;
		if(a - b > max){max = a - b;}
		if(a * b > max){max = a * b;}
		System.out.println(max);
	}
}
