import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int cnt = 0;
 	String S = sc.next();
  	String T = sc.next();
  	char[] s_arr = S.toCharArray();
	char[] t_arr = T.toCharArray();
  
  	for (int i=0;i<3;i++){
      	if (s_arr[i] == t_arr[i]){
          	cnt++;
        }
    }
  	System.out.println(cnt);                           
}
}