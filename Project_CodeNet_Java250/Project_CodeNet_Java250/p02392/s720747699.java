import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
		//3????????´??°???????????????
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		yesNo(a, b, c);
	}

	//a<b<c??§Yes???????????????????????????
	public static void yesNo(int a,int b, int c){
		String ans = "No";
		if(a < b){
			ans = "No";
			if(a < c){
				ans = "No";
				if(b < c){
					ans = "Yes";
				}
			}
		}
		System.out.println(ans);
	}
}