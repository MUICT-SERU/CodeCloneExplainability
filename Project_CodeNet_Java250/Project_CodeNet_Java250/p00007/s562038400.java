import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * ?????????????????§??????????????????????????°??£?????????????????????????\?????????? 10 ???????????????????????????????????¨??????????????????????????¨???????????????
	 * ???????\???????????????±????????¨??? 5% ???????????????????????????????????????????????? 1,000 ?????????????????????????????????
     *n ?????\???????????¨??????n ??±????????????????????????????????????????????????????????°?????????????????????????????????n ??? 100 ??\?????¨????????????
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);                   
  
        int weekNum = Integer.parseInt(br.readLine());
        
        
        int debt = 100000;	//????????????
        int roundUpNum =1000;	//?????????????????°???
        
        for(int i = 0;i < weekNum;i++) {
        	debt *= 1.05;
        	//1000???????????????????????????
        	debt = (int)Math.ceil((double)debt / roundUpNum) * roundUpNum;
        }
        System.out.println(debt);
        
        
        
	}
	
	

}