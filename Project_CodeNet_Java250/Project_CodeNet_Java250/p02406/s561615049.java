import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 3; i <= n; i++){
			
			if(i % 3 == 0){
				System.out.print(" " + i);
			}else{
				//String??????????????????1????????\??????char'3'????????????
				String strNum = String.valueOf(i);
				//???????????????boolean??§??????
				boolean isMatch = false;
				for(int j = 0; j < strNum.length(); j++){
					//for?????§??¨?????????????????????boolean??§??????					
					char x = strNum.charAt(j);
					if(x == '3'){
						isMatch = true;
					}
				}
				if(isMatch){
					//ture?????´???????????????????????§??¨?????????
					System.out.print(" " + i);					
				}
			}
		} 
		System.out.println();
	}
}