import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int num = 0;
	    for(int i = 0; i < s.length(); i++) {
	    	if("+".equals(s.substring(i, i+1))) {
	    		num++;
	    	} else {
	    		num--;
	    	}
	    }
	    System.out.println(num);
	}
}
