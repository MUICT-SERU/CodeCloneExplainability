import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;

/*Question
/????????¨??±?????????????????????????????????????????????????????????n???????????????????????£????????????n??????????????????????????????
/??????????????§???????????????1??????????????????????????????
/?????????????????¢????????????????????????????????????????????????????????????????????????????????§??§?????????????????????????????????????????¨?????????
/????????????3????????????????????????????????´?????????????????????1?????????????????????????????????
/????????¨??±???????????????????????????????????±???????????????????????????????????????????????????????????????????????????????????°????????????????????????
*/
/*Input
/??????????????????????????°n?????????????????????
/?¶????n??????????????????????????????????????±?????????????????????
/1????????????????????????????????????????????????????????????????????????2???????????????????????±???????????????????????????????????????????????§?????????
*/

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		//????????¨
		StringBuffer sb = new StringBuffer();
		//?????????????????????
		int t = 0;
		//??±??????????????????
		int h = 0;
		//???????????????????????\???(?????????????????°)
		int n = Integer.parseInt(sc.readLine());
		//?????????????????????(??????????????????????????????)
		for(int i = 0;i < n;i++){
			/*??????????????\???
			/?????????????????????" "(??????)??§????????£?????????s??¨??????
			/s[0]????????????s[1]?????±?????¨??????
			*/
			String[] s = sc.readLine().split(" ");
			/*??????????????????
			/??????????????§???????°???????????????§??????????????????
			/??????????????????????????¨?????????????????????
			/???????????????0????????§?????????????????????????????§
			/??????????????±???
			/????????\?????????????????????????????????????????????????????¨??????(????????????????????????????????¨??????)
			*/
			if(s[0].compareToIgnoreCase(s[1]) > 0){
				t += 3;
			}else if(s[0].compareToIgnoreCase(s[1]) < 0){
				h += 3;
			}else{
				t++;
				h++;
			}
		}
		//?????????????????????????????????????????¨?????????????????¨(sb)?????¨????´?(????????????????????????????????????????????????????????§?????¨??????????????¨???sb????????¨)
		sb.append(t+" "+h+"\n");
		System.out.print(sb);
	}
}