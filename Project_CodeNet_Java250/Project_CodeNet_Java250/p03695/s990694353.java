import java.util.*;

public class Main {    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);                
        
       boolean flag[] = {false,false,false,false,false,false,false,false};
        
       int over = 0;
            
       int N = sc.nextInt();
       
       int a[] = new int[N];


    for(int i = 0;i < N;i++){       
       a[i] = sc.nextInt();
           
       if(a[i] >= 3200){
               over++;
       }

       for(int j = 0;j <= 7;j++){           
           if(400*j <= a[i] && a[i] < 400*(j+1)){
                flag[j] = true;
           }                                            
       }
       
    }
               
    int sum = 0;
       
    for(int i = 0;i < 8;i++){
        
           if(flag[i]){
               sum++;
           }
           
    }
       
       int min = sum;       
       if(sum == 0)
            min = 1;       

       int max = sum + over;       
       
       System.out.println(min + " " + max);
        
    }                                      
}