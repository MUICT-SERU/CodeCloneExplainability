import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
		String s=reader.readLine();
		String p=reader.readLine();
		String ss=s+s;//s????????????????????¨??§???????????°???1?????¨???????????????

		//??£?????¨???????????£????±??????????

		Pattern pat=Pattern.compile(p);

		check(pat, ss);


		}catch(IOException e){
			System.out.print(e);
		}
	}

	private static void check(Pattern pat, String ss){
		Matcher m=pat.matcher(ss);
		if(m.find()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}