import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();  
        if(x - r < 0 || y - r < 0 || x + r > W || y + r > H){
        	System.out.println("No");
        	}
        else if(x - r >= 0 && y - r >= 0 && H >= x + r && W >= y + r){
        	System.out.println("Yes");
        	}
	}

}
