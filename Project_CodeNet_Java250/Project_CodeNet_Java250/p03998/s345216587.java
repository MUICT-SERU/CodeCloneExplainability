import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String stra = input.readLine( );
		String strb = input.readLine( );
		String strc = input.readLine( );

		String[] list  = new String[3];
		list[0] = stra;
		list[1] = strb;
		list[2] = strc;

		int next = 0;
		String answer = "";
		while(list[0].length() >= 0 && list[1].length() >= 0 && list[2].length() >= 0){
			if(list[next].length() == 0){
				if(next == 0){
					answer = "A";
				}else if(next == 1){
					answer = "B";
				}else if(next == 2){
					answer = "C";
				}
				System.out.println(answer);
				break;
			}
			if(list[next].startsWith("a")){
				list[next] = list[next].substring(1);
				next = 0;
			}else if(list[next].startsWith("b")){
				list[next] = list[next].substring(1);
				next = 1;
			}else if(list[next].startsWith("c")){
				list[next] = list[next].substring(1);
				next = 2;
			}
		}
	}

}
