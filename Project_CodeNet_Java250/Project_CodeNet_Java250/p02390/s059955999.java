import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       
       int h,m,b;
       h=s/3600;
       m=(s%3600)/60;
       b=((s%3600)-m*60);
       System.out.println(h+":"+m+":"+b);
       
       
	}

}