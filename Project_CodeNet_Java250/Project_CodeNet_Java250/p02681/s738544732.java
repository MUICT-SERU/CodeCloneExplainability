import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String t=sc.next();
		
		
		if(t.indexOf(s)==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		
	sc.close();
	}

}
