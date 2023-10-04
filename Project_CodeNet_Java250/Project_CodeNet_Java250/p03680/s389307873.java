import java.util.*;

public class Main {    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       
        int N = sc.nextInt();
       
        int a[] = new int[N];       
        
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0;i < N;i++){
           if(a[i] == 2){
               break;
           }            
           if(a[i] != 2){
               continue;
           }else if(a[N-1] != 2){
               System.out.println(-1);
               return;
           }
       }

        int count = 1;

        int index = a[0];
        
        while(true){
           if(count > N){
               System.out.println(-1);
               return;
           }            
           if(index == 2){
               System.out.println(count);
               return;
           }else{           
              index = a[index-1];
              count++;
           }           
        }                
       
    }        
}        