import java.io.IOException;
import java.util.Scanner;

//??§?°????????????????????????°??????
public class Main{

	public static void main(String[] args) throws IOException{

		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		evaluation(x,y);
		in.close();

	}

	public static void evaluation(int a, int b){
		if(a<b){
			System.out.println("a < b");
		}else if(a>b){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}

	}

}