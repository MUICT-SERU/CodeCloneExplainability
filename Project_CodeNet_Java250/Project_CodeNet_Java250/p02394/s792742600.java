import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		new Main();
	}
	Main(){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		scan.close();
		if(!isTouch(W,H,x,y,r))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	boolean isTouch(int W,int H,int x,int y,int r){
		if(isTouchAbove(W,H,x,y,r) || isTouchBottom(W,H,x,y,r) || isTouchLeft(W,H,x,y,r) || isTouchRight(W,H,x,y,r))
			return true;
		return false;
	}
	private boolean isTouchLeft(int W,int H,int x,int y,int r) {
		// TODO ?????????????????????????????????????????????
		if(x - r < 0)
			return true;
		return false;
	}
	private boolean isTouchAbove(int W,int H,int x,int y,int r) {
		// TODO ?????????????????????????????????????????????
		if(y + r > H)
			return true;
		return false;
	}
	private boolean isTouchRight(int W,int H,int x,int y,int r) {
		// TODO ?????????????????????????????????????????????
		if(x + r > W)
			return true;
		return false;
	}
	private boolean isTouchBottom(int W,int H,int x,int y,int r) {
		// TODO ?????????????????????????????????????????????
		if(y - r < 0)
			return true;
		return false;
	}

}