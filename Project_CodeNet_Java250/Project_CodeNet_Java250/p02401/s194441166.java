import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		int a, b;
		String op;
		
		for(;;){
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();
			
			if(op.equals("+")){
				System.out.println(a + b);
			}else if(op.equals("-")){
				System.out.println(a - b);
			}else if(op.equals("/")){
				System.out.println(a / b);
			}else if(op.equals("*")){
				System.out.println(a * b);
			}else if(op.equals("?")){
				break;
			}
		}
	}

}