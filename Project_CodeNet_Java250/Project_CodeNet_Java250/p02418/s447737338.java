import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String p = sc.next();
        
        s += s;
        if(s.indexOf(p)!=-1){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
}

