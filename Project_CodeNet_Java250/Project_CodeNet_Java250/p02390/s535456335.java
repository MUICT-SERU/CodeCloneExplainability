import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = 0;
		int m =0;
		int s = 0;
		h=S / 3600;
		m = (S  - h * 3600) / 60;
		s = S -(h*3600+m*60);
		System.out.println(h+":"+m+":"+s);
		sc.close();
	}
}