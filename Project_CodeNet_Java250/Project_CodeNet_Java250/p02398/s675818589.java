import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO ?????????????????????????????????????????????
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int d;
          d=0;
          while(a<=b){
        	  if(c%a == 0){
        		d=d+1;  
        	  }
        	  a=a+1;
          }
          System.out.println(d);
	}

}