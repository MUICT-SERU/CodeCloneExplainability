import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int idx = 1;
      while(idx <= 5) {
      	int num = sc.nextInt();
      	if(num == 0) {
      		System.out.println(idx);
      		return;
      	}
      	idx++;
      }
      sc.close();
  }
}