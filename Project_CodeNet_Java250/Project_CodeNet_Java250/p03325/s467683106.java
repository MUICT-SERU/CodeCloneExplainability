import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int N = in.nextInt();
        int ans=0;
        
        for(int i=0;i<N;i++){
        	int a=in.nextInt();
        	
        	for(;a%2==0;a/=2)
        		ans++;
        	
        }
        
        System.out.println(ans);


    }

}
