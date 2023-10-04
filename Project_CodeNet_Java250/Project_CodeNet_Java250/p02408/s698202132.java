import java.util.Scanner;

class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	boolean[][] cards = new boolean[4][13];
    	String s = null;
    	int num;
    	
    	for(int j = 0; j < 4; j++){
    		for(int i = 0; i < 13; i++){
    			cards[j][i] = false;
    		}
    	}
    	
    	for(int i = 0; i < n; i++){
    		s = scan.next();
    		num = scan.nextInt();
    		num--;
    		
    		
    		switch(s){
    			case "S":
    				cards[0][num] = true;
    				break;
    			case "H":
    				cards[1][num] = true;
    				break;
    			case "C":
    				cards[2][num] = true;
    				break;
    			case "D":
    				cards[3][num] = true;
    				break;
    		}
    	}
    	
    	for(int j = 0; j < 4; j++){
    		for(int i = 1; i < 14; i++){
    			if(cards[j][i - 1] == true){   				
    			}else{
    				switch(j){
    				  case 0:
    					  s = "S";
    					  break;
    				  case 1:
    					  s = "H";
    					  break;
    				  case 2:
    					  s = "C";
    					  break;
    				  case 3:
    					  s = "D";
    					  break;
    				}   				
    				System.out.println(s + " " + i);
    			}
    			
    		}
    	}
     }
}