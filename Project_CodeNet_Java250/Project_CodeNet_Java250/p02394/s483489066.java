import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int w,h,x,y,r;
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();	//????????¢???x??§?¨?
		h = sc.nextInt();	//????????¢???y??§?¨?
		
		x = sc.nextInt();	//??????x??§?¨?
		y = sc.nextInt();	//??????y??§?¨?
		r = sc.nextInt();	//????????????

		w -= r;
		h -= r;
		
		if(r<=x && x<=w && r<=y && y<=h){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		sc.close();
	}

}