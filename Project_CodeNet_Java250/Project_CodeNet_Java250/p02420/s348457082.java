import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m; //???????????£??????????????????
		StringBuffer cards;; 
		String shuCards = "";

		while(true){
	        cards = new StringBuffer(br.readLine());
			if(cards.toString().equals("-")){break;}
			m = Integer.parseInt(br.readLine());
			int cnt = 0; //???????????£??????????????????
			while(cnt++ != m){
				int h = Integer.parseInt(br.readLine()); //?????????h???????????????????????????????????£???????????????
				shuCards = cards.substring(h, cards.length());
				shuCards += cards.substring(0, h);
				cards.delete(0, cards.length());
				cards.append(shuCards);
			}
			System.out.println(shuCards);
		}
    }
 
}