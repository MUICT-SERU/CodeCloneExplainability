import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputData;
            StringBuilder sb = new StringBuilder();
            while(true){
	            inputData = reader.readLine();
	            if("0 0".equals(inputData)){
	            	break;
	            }else{
					String[] strNumber = inputData.split(" ");
					int a = Integer.parseInt(strNumber[0]);
					int b = Integer.parseInt(strNumber[1]);
					if(a > b){
						sb.append(b + " " + a);
					}else{
						sb.append(a + " " + b);
					}
					sb.append(System.getProperty("line.separator"));
	            }
            }
            System.out.print(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}