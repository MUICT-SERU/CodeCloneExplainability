import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
/*Question
/n ????????????????????????????????§????????°???????????°???????¨?????????£??????????????????????????????s1, s2 ... sn??¨????????¨??????????¨??????????????±???????????????°????????????????????????
/?????????????????????m??¨????????°????????£?±2?????\???????????§????????????:
/?±2 = (???ni=1(si - m)2)/n
/?????£?????£????????????????¨???????????±??¨?????????
*/
/*Input
/?????°??????????????????????????\?????¨????????????????????????
/??????????????????????????\????????¢?????§???????????????:
/???????????° n s1 s2 ... sn
/n ??? 0 ?????¨?????\?????????????????¨?????????
*/

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		//????????¨
		StringBuffer b = new StringBuffer();
		//????¨??????\??????double t??????????????\??????double m????????£?????\??????double o????¨???????????????\??????double p
		double t = 0;
		double m,p;
		double o = 0;
		while (true){
			/*??\?????¨
			/?????????????????°?????£??\
			*/
			int n = Integer.parseInt(sc.readLine());
			if(n==0)
				break;
			String[] st = sc.readLine().split(" ");
			int[] z = new int[st.length];
			for(int i = 0;i < st.length;i++){
				z[i] = Integer.parseInt(st[i]);
			}
			//????¨?????¨????
			for(int i:z)
				t += i;
			//??????????¨????
			m = t/n;
			//?????£????¨????
			for(int i:z)
				o += Math.pow(i - m,2);
			o /= n;
			//?¨??????????????¨????
			p = Math.sqrt(o);
			b.append(String.format("%.8f",p)+"\n");
			//t:????¨????o:?????£???????????¢????????????????????¨??£?????????????????????
			t = 0;
			o = 0;
		}
		System.out.println(b);
	}
}