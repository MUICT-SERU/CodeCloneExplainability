import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/*??¶?´???????????????????*/
	public static void judge(int parse[]){
			if(parse[0]<=0||parse[0]>100){
				System.out.println("W?????\?????????1~100??\???????????§???.???????????????.");
				System.exit(0);
		}
			else if(parse[1]<=0||parse[1]>100){
				System.out.println("H?????\?????????1~100??\???????????§???.???????????????.");
				System.exit(0);
	    }
			else if(parse[2]<-100||parse[2]>100){
				System.out.println("x?????\?????????-100~100??\???????????§???.???????????????.");
				System.exit(0);
			}
			else if(parse[3]<-100||parse[3]>100){
				System.out.println("y?????\?????????-100~100??\???????????§???.???????????????.");
				System.exit(0);
			}
			else if(parse[4]<=0||parse[4]>100){
				System.out.println("r?????\?????????1~100??\???????????§???.???????????????.");
				System.exit(0);
			}
	}
	 public static void main(String[] args) throws IOException{
		int W,H,x,y,r;
		String str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();

		String[] st = str.split(" ");
		/*for(int i=0;i<st.length;i++){
		 System.out.println("st["+i+"]="+st[i]); //?????????????´??¢????
		 }*/
		int len=st.length; //?????????????´???°
		int parse[] = new int[len]; //String???int????????¨??????

		for(int p=0;p<len;p++){
			parse[p]=Integer.parseInt(st[p]); //String???int??????
		}

		W=parse[0]; H=parse[1]; x=parse[2]; y=parse[3]; r=parse[4];

		judge(parse); //??¶?????????.????????????????????°????????????
		/*??????????????§????????¨?°???????????????\????????????????????\??????????????????????????????*/

		/*for(int i=0;i<st.length;i++){
		 System.out.println("st["+i+"]="+st[i]); //?????????????´??¢????
		 }*/

		/*????????¨????????????*/

		if((x-r<0||x+r>W)||(y-r<0||y+r>H))
			System.out.println("No");
		else if((x-r>=0&&x+r<=W)&&(y-r>=0&&y+r<=H))
			System.out.println("Yes");

	}

}