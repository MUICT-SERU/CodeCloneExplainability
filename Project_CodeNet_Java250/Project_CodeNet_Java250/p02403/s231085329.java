import java.util.*;
 
class Main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        while(true){
            int x = in.nextInt();   
            int y = in.nextInt();
            if (x == 0 && y == 0)break;
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < x;i++){
                for(int j=0;j < y;j++){
                    sb.append("#");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }   
    }
}