import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void maain(){

	}

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		//?????????????¨?????????£?¨?
		boolean[] S = new boolean[13];
		boolean[] H = new boolean[13];
		boolean[] C = new boolean[13];
		boolean[] D = new boolean[13];

		//1???????????\????????¢
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);

        //2???????????\????????¢
        for(int set = 0;set < n; set++ ){
        	String[] input2 = br.readLine().split(" ");
        	String mark = input2[0];
        	int num = Integer.parseInt(input2[1]);

        	//?????£?????????????????????true???????????????
        	if(mark.equals("S")){
        		S[num - 1] = true;
        	}else if(mark.equals("H")){
        		H[num - 1] = true;
         	}else if(mark.equals("C")){
        		C[num - 1] = true;
        	}else if(mark.equals("D")){
        		D[num - 1] = true;
      		}
        }

        //?????£?????????????????????????????¢?????¨???????????????
    	for(int set = 0;set < 13; set++){
    		if(S[set] == false){
    			System.out.println("S" + " " + (set + 1));
    		}
    	}
    	for(int set = 0;set < 13; set++){
    		if(H[set] == false){
    			System.out.println("H" + " " + (set + 1));
    		}
    	}
    	for(int set = 0;set < 13; set++){
    		if(C[set] == false){
    			System.out.println("C" + " " + (set + 1));
    		}
    	}
    	for(int set = 0;set < 13; set++){
    		if(D[set] == false){
    			System.out.println("D" + " " + (set + 1));
    		}
    	}
	}
}