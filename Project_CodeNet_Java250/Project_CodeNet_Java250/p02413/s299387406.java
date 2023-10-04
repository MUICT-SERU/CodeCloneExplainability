import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strArray = input.split(" ");

        int r = Integer.parseInt(strArray[0]);  //???r
        int c = Integer.parseInt(strArray[1]);  //???c

        int[][] table = new int[r+1][c+1];

//      ??????A???????????????
        for(int i = 0; i < r; i++){
            input = br.readLine();
            strArray = input.split(" ");

            for(int j = 0; j < c; j++){
                table[i][j] = Integer.parseInt(strArray[j]);
            }
        }

//      ???????????????????????¨??????????????????????¨????????±???????
        for(int i = 0; i < r; i++){
            int sum = 0;

            for(int j = 0; j < c; j++){
                sum += table[i][j];
            }
            table[i][c] = sum;
        }

//      ???????????????????????¨??????????????????????¨????????±???????
//      ?????????????¨??????§?????????????????????????¨??????????????????§???
//      i????????????c+1??¨?????????
        for(int i = 0; i < c+1; i++){
            int sum = 0;

            for(int j = 0; j < r; j++){
                sum += table[j][i];
            }
            table[r][i] = sum;
        }

//      (r+1) ?? (c+1) ?????°????????¨?????????
        for(int i = 0; i < r+1; i++){

            for(int j = 0; j < c+1; j++){
                System.out.print(table[i][j]);

                if(j != c){
                    System.out.print(" ");
                }else{
                    System.out.print("\n");
                }
            }
        }
    }
}