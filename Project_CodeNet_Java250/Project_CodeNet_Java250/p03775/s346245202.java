import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);              

      long n = sc.nextLong();
      int ans = 0;
      long a = 0;
      long i;
      long j = 0;
      for(i = 1; i*i <= n; i++){
	    if(n % i == 0){
		a = (int) (n / i);
		j = i;
	    }
	}
      
	int p = String.valueOf(a).length();
	int q = String.valueOf(j).length();
	if(p < q){
		System.out.println(q);
	}else{
		System.out.println(p);
	}    
    
  }   
}
