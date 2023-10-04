import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) throws Exception{    
        Scanner sc = new Scanner(System.in);
        
       String w = sc.next();
       
       int[] x = new int[26];
       
       for(int i=0; i<w.length(); i++){
    	   x[(int)w.charAt(i) - 97]++;
       }
       
       String ans = "Yes";
       for(int i=0; i<26; i++){
    	   if(x[i]%2 == 1){
    		   ans = "No";
    		   break;
    	   }
       }
       
       System.out.println(ans);
        
       sc.close();
    }
 
}