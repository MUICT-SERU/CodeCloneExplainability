//????????????????????????????????????????????????????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = br.readLine();			//??\??????????????????inputStr
		String searchStr = br.readLine();			//????´¢??????
		
		String ringInputStr = inputStr + inputStr;
		
		if(ringInputStr.contains(searchStr)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
	}

}