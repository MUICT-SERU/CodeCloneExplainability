import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");
		int count5 = 0;
		int count7 = 0;

		for(int i=0; i<list.length; i++){
			if(list[i].equals("5")){
				count5 = count5 + 1;
			}else if(list[i].equals("7")){
				count7 = count7 + 1;
			}
		}

		if(count5 == 2 && count7 == 1){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
