import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> list = new ArrayList<String>();

		while(true){
			try{

				String strScan = insBR.readLine();


				if("END_OF_TEXT".equals(strScan)){
					break;
				}else{
					list.add(strScan);
				}


			}catch(IOException e){
				System.out.println(e);
			}

		}


		//????´¢?????????????????????????????°
		String strFindLine = null;
		//????????\???????????????????????°
		String strLine = null;

		//????´¢?????????????????????????????????????????°
		int intCount = 0;
		for(int i = 0; i < list.size(); i++){
			//????´¢??????????????????
			if(i == 0){
				//list???0??????
				strFindLine = list.get(i);
				strFindLine = strFindLine.toLowerCase();
			}else{
				//list1????????\???
				strLine = list.get(i);
				strLine = strLine.toLowerCase();
				//1??????????????§??????????????????????´?
				String[] ary = strLine.split(" ");
				//1????????????????????¨????????´????????????????????????
				for(int j = 0; j < ary.length; j++){
					//ary[]???????????¨findLine???????????°???????????????????´¢
					if(ary[j].length() == strFindLine.length()){

						int intJudge = ary[j].indexOf(strFindLine);

						if(-1 < intJudge){
							intCount++;
						}
					}
				}

			}
		}
		System.out.println( intCount);
	}
}