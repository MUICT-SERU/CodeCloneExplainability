

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//????????£?????????????????????
		Scanner sc = new Scanner(System.in);
		//
		while(true){
		//??£?¨??????????????????????
		long sum = 0;
		//1??????????????????
		String line = sc.nextLine();
		//?????£?????\???????????????1???
		
			//?????£?????\????????????1??????0?????£?????´????????????
			if(line.equals("0")){
				break;
				}
			
			//
			for(int i=0;i<line.length();i++){
				sum += Integer.parseInt(String.valueOf(line.charAt(i)));
			}
			//
			System.out.println(sum);
		}
	}
}