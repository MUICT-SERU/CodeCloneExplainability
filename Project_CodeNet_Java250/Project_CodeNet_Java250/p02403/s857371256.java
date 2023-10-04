
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		
	    Scanner sc = new Scanner(System.in);
		
	    while(true){
			
	        //縦Hと横Wの値を受け取る
		String s1 = sc.next();
	        int H = Integer.parseInt(s1);
	        String s2 = sc.next();
	        int W = Integer.parseInt(s2);
	        
	        //値が条件（３００以下であるか）にあっているか確認
	        if(H <= 300 && W <= 300){
	        
	        	//０と０が入力された時プログラムは終了する
	            if(H == 0 && W == 0){
	        	    break;
	            }
	        
	            //縦H個、横W個　”＃”を表示させる
	            for(int i = 1; i <= H; i++){
	        	    for(int j = 1; j <= W; j++){
	        		    System.out.print("#");
	        	    }
	        	    System.out.println("");
	            }
                    System.out.println("");
	        }
	    }
	}
}