import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

/*Question
/???????????????????¨???????????????????????????????????????????????¨???°????????°??????????????°??????????¨???°???????¨??????§??????
/????????°????????¬?????????????¨??????§?¨???°???????????°??? (1+2)*(5+4) ?????????????????????????¨??????§??? 1 2 + 5 4 + * ??¨?¨???°???????????????
/???????????????????¨??????§?????????????¨??????§????????¨????????¬??§???????????§???????????¨????????????????????????????????????
/???????????????????¨??????§?????????????????°???????¨???????????????????????????????????????? 
*/

/*Input
/???????????°??????????????????????????????????????£?¶?????????????????????????????????????????????????????????????????????????????????§???????????????????????????????????? 
*/

public class Main {
	public static void main(String[] args) throws Exception {
		int i = Calc();
		System.out.println(i);
	}

	/*Calc????????????
	/Unicode????????????????????§?????°???????¨???????????????§???????????§????????§??????????????°???????¨???????????????????
	/??°?????????x??????????????????
	/??°?????????????????????????????????????¨??????????????????????x?????????????????¨???????????§?¨????????????°??????
	/?¨??????????????????????2?????´???????????????????????????????????????????????\??????????????????????¶?????????????
	*/

	static int Calc() throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		//???????????????????????°???????´????????????????????´???¨
		List<Integer> x = new ArrayList<Integer>();
		//???????????£??¨
		int t;
		//??\???
		String[] s = sc.readLine().split(" ");
		//?¨??????????????????°???????????????????????????
		for (int i = 0;i < s.length;i++){
			if (s[i].compareToIgnoreCase("-") > 0) {
				x.add(Integer.parseInt(s[i]));
			}else {
				if(s[i].equals("*")){
					t = (x.get(x.size()-2)*x.get(x.size()-1));
					if (x.size() > 2) {
						x.remove(x.size()-1);
						x.remove(x.size()-1);
					}else x.clear();
					x.add(t);
				}else if(s[i].equals("+")){
					t = (x.get(x.size()-2)+x.get(x.size()-1));
					if (x.size() > 2) {
						x.remove(x.size()-1);
						x.remove(x.size()-1);
					}else x.clear();
					x.add(t);
				}else if(s[i].equals("-")){
					t = (x.get(x.size()-2)-x.get(x.size()-1));
					if (x.size() > 2) {
						x.remove(x.size()-1);
						x.remove(x.size()-1);
					}else x.clear();
					x.add(t);
				}
			}
		}
		return x.get(x.size()-1);
	}
}