import java.util.Scanner;

public class Main {


		public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int ans[] = new int[26];
		
		while(scan.hasNext()){
			//??\??????????????±?????????????????¢???????????????????????°????¨??????????
			String moji = scan.nextLine();
			
			moji = moji.toLowerCase();
		
			int moji_len = moji.length();
			
			//??\????????????????????????????????????????????????????????§
			for(int cnt_len = 0; cnt_len < moji_len; cnt_len++){
			
				char moji_one = moji.charAt(cnt_len);
			
				//????????????????????????a~Z??????????????¨?????´????????????????????????
				int num = moji_one - 'a';  // ???????????????
				if(num >= 0 && num <= 26)
					ans[num]++; 
			}
		}
		//???????????¨???
		for(int cnt_arp = 0; cnt_arp < 26; cnt_arp++){
			
			System.out.println((char)(cnt_arp + 'a') + " : " + ans[cnt_arp]);
		}
		//????§????
		scan.close();
	}
}