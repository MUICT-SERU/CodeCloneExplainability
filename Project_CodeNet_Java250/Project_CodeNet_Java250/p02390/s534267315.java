import java.util.Scanner;

//?§????????????????S???hms?????????????????????????????°??????
public class Main{


	public static void main(String[] args){

		//?¨??????\???
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		area(a);


	}

	//????????¢?????¢???????±?????????????????????????
	private static void area(int a){

		int h, m, s;
		h=a/3600;
		m=(a%3600)/60;
		s=((a%3600)%60);
		System.out.println(h+":"+m+":"+s);
	}


}