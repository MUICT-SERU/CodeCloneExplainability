import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        int H = in.nextInt();
        int W = in.nextInt();
        if(H==0&&W==0){
            break;
        }
        for(int i = 0; i<H ; i++){
            for(int j = 0; j<W ; j++){
                if((i==0||j==0)||(i==H-1||j==W-1)){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                    }
                        }
                    System.out.println();
                            }
                        System.out.println();
                }
            }
        }


