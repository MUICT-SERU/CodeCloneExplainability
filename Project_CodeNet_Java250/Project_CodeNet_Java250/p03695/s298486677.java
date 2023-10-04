import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int n = Integer.parseInt(str);
		str = input.readLine( );
		String[] strlist = str.split(" ");
		int[] list = new int[n];
		int count32 = 0;
		boolean[] check = new boolean[8];
		for(int i=0; i<n; i++){
			list[i] = Integer.parseInt(strlist[i]);
			if(list[i] < 3200){
				check[list[i]/400] = true;
			}else{
				count32++;
			}
		}
		int count = 0;
		for (boolean bl: check) {
			  if (bl) count++;
		}
		if(count == 0){
			count = 1;
			count32 = count32-1;
		}

		System.out.print(count+" ");
		System.out.println(count + count32);

	}
}
