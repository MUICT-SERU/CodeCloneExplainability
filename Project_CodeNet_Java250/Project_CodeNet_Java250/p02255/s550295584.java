import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void maain(){

	}

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		//1???????????\????????¢
	       StringBuilder buider = new StringBuilder();

	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int key = 0;
        int kari = 0;


        //2???????????\????????¢
        String[] input2 = br.readLine().split(" ");

        //???????????????
        int[] num = new int[Integer.parseInt(n)];

        for(int set = 0; set < num.length; set++){
        	num[set] = Integer.parseInt(input2[set]);
        }

        //???????????????????????¨???
        for(int out = 1;out  <  num.length; out++){
        	key = num[out];
        	kari = out -1;
        	//???????????\
        	for(int set = 0; set < num.length; set++){
        		buider.append(num[set]);
        		if(set != num.length -1){
        			buider.append(" ");
        		}
        	}
        	System.out.println(buider.toString());

        	//????????¢?????????
        	buider.setLength(0);

        	//????????????
        	while(kari >= 0 && num[kari] > key){
        		num[kari + 1] = num[kari];
        		kari--;
        	}

        	//while?????\???????????´???
        	num[kari + 1] = key;
        }

        //??????????????¢??¨???
    	for(int set = 0; set < num.length; set++){
    		buider.append(num[set]);
    		if(set != num.length -1){
    			buider.append(" ");
    		}
    	}
    	System.out.println(buider.toString());
	}
}