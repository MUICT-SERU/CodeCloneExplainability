import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
		int q=sc.nextInt();
  	   	int[] a=new int[q];
  		int[] b=new int[n];
		for(int c=0;c<q;c++){
    		a[c]=sc.nextInt();
    	}
  		
  		for(int p=0;p<n;p++){
        	b[p]=0;
        }
  		
  		for(int d=0;d<q;d++){
          	b[a[d]-1]++;
        }
          
    	for(int f=0;f<n;f++){
 		if((k-q+b[f])<=0){
    		System.out.println("No");
    	}else{
     		System.out.println("Yes");
   	 }

        }
    }
}
