import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int ans=0;
		ans+=Math.max(a,b);
  		if(a<=b){
          b--;
        }else{
          a--;
        }
  		ans+=Math.max(a,b);
  		
    
    	System.out.println(ans);
    }
}