import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>c){
          int w = a;
          a = c;
          c = w;
          w = b;
          b = d;
          d = w;
        }
        if(b < c){
            System.out.println(0);
        }
        else if(b>d){
            System.out.println(d-c);
        }else{
            System.out.println(b-c);
        }
	}
}
