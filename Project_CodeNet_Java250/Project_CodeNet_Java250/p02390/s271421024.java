import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a >= 0 && a < 86400){
	    int h = a / 3600;
	    int m = a % 3600 / 60;
	    int s = a % 60;
		System.out.println(h+":"+m+":"+s);
	}
    }
}