import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int p[] = new int[n];
      	int num;
      	int count=1;
      	for(int i = 0; i<n; ++i){
          p[i] = sc.nextInt();
        }
          num = p[0];
        for(int i = 1; i<p.length; ++i){
          if(p[i]< num){
            count +=1;
            num = p[i];
          }
        }
      System.out.println(count);

    }
}