import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int k = Integer.parseInt(strlist[0]);
		int s = Integer.parseInt(strlist[1]);
		int count = 0;

		for(int x = 0; x <= k; x++){
			for(int y = 0; y <= k; y++){
				int z = s - x -y;
				if(z >= 0 && z <= k){
					count = count + 1;
					continue;
				}
			}
		}

		System.out.println(count);


	}

}
