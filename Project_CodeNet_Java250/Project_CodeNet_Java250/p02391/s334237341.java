import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		//a,b2????????°??????????????????
		a = scan.nextInt();
		b = scan.nextInt();
		sizeComparison(a,b);
	}
	//a,b????????°?????§?°???¢??????????????????
	public static void sizeComparison(int a, int b){
		String i = "==";//?????????????????????????´???????
		if(a < b){
			i = "<";
		}else if(a > b){
			i = ">";
		}
		//??????
		System.out.println("a " + i + " b");
	}
}