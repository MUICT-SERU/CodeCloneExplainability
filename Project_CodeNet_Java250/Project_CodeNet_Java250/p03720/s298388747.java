import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int cityNum = sc.nextInt();
        int roadNum = sc.nextInt();
        
        int[] ownNum = new int[cityNum];
        
        for(int i=0 ; i< (roadNum*2); i++){
            int cityName = sc.nextInt();
            ownNum[cityName-1]++;
        }
        
        for(int i=0; i< cityNum ; i++){
            System.out.println(ownNum[i]);
        }
    }
}