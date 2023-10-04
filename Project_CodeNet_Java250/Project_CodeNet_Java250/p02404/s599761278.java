import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int H = 0;  //??????????????°
        int W = 0;  //??????????????°

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

//      ?????°????????????????????????????§????????????????????????????????????????1????????????????????????????????????
        while(true){
            String input = br.readLine();
            String[] strArray = input.split(" ");

            H = Integer.parseInt(strArray[0]);
            W = Integer.parseInt(strArray[1]);

//          H??¨W?????±???0?????¨??????????????????
            if(H == 0 && W == 0){
                break;
            }

//          ??????????????°?????°?????????
            for(int i = 0; i < H; i++){

//              ????????¨????????????????????¨??????
                if(i == 0 || i == H-1){
                    for(int j = 0; j < W; j++){
                        output.append("#");
                    }
                }else{
                    for(int j = 0; j < W; j++){

//                      ????????¨????????????????????¨??????
                        if(j == 0 || j == W-1){
                            output.append("#");
                        }else{
                            output.append(".");
                        }
                    }
                }output.append("\n");
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}