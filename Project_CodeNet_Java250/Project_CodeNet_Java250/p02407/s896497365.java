import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
        Scanner scan = new Scanner(System.in);
        
        int n        = scan.nextInt();
        int [] a     = new int[100];
        
        for(int i = 0; i < n; ++i){
        	
            a[i] = scan.nextInt();
        }
        
        for(int i = n - 1; i >= 0; --i){
        	
            System.out.print(a[i]);
            
            if(i > 0){
                System.out.print(' ');
            }
        }
        
        System.out.println();
    }
}