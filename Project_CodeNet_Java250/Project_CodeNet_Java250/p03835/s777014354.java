import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int S = sc.nextInt();
        int count = 0;
            
            for(int X=0; X<=K; X++){
                for(int Y=0; Y<=K; Y++){
                    int Z = S-X-Y;
                    if(0<=Z && Z<=K){
                        count++;
                    }
                }
            }
            
            System.out.println(count); 
    } 
}
