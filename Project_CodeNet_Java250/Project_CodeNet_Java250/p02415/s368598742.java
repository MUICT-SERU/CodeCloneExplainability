
import java.util.Scanner;

//????????????????????????????°?????????¨??§???????????\????????????????????????????????????????????????
//??¢????????????????????\???????????????????????????????????????????????????
public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		//char?????????????????£?¨?
		//Character???????????§??????????????§???????°???????????????\??§?????????
		char [] csen = s.toCharArray();
		for(int i = 0; i < csen.length; i++){

			//?????°???char??????????????§??????(isUpperCase)????°???????(isLowerCase)????????????????????????
			//????????£???????????°true???????????§???????????°false??????????????????
			if(Character.isUpperCase(csen[i])){
				//toLowerCase??§????°????????????????????????????????????????
				csen[i] = Character.toLowerCase(csen[i]);
			}else{
				//toUpperCase??§?????§???????????????????????????????????????
				csen[i]=Character.toUpperCase(csen[i]);
			}
		}

		//?????????Char??????String????????????
		String ans = "";
		for(int i = 0; i < csen.length; i++){
			ans += csen[i];
		}

		//????????????
		System.out.println(ans);
		sc.close();
	}
}