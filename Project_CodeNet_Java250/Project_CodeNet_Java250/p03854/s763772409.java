import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

			if(str.matches("^((dreamer)|(eraser)|(dream)|(erase))+$") ){
				System.out.println("YES");
			}else{
				System.out.println("NO");
				System.exit(0);
			}
		}

}
