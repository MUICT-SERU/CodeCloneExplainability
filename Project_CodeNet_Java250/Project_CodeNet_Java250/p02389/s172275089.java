import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		int a, b, area, length;
		String str;	//?????°???????´?????????????????????????
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		
		String[] splittedStr = str.split(" ", 0);	//?????°???????????§????????????
		a = Integer.parseInt(splittedStr[0]);		//??????????????´??°?????????
		b = Integer.parseInt(splittedStr[1]);		//??????
		
		area = a*b;
		length = 2*(a+b);
		
		System.out.println(area + " " + length);
	}
}