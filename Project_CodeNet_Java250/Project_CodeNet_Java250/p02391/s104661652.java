import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO ?????????????????????????????????????????????
		//?????°?????£?¨?
		int a,b;
		String str;

		//????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();

		//??????
		String[] st = str.split(" ");

		 a = Integer.parseInt(st[0]);
		 b = Integer.parseInt(st[1]);

		 /*for(int i=0;i<st.length;i++){
		 System.out.println("st["+i+"]="+st[i]); //?????????????´??¢????
		 }*/

		 if(a<-1000||b<-1000||a>1000||b>1000){
			 System.out.println("a,b?????????-1000~1000??§??\???.???????????????.");
			 System.exit(0);
		 }

		 if(a>b) System.out.println("a > b");

		 else if(a<b) System.out.println("a < b");

		 else if(a==b) System.out.println("a == b");
	}

}