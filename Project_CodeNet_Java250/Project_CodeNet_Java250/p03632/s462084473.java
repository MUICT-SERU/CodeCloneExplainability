import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner (System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int d=stdIn.nextInt();
		int count=0;
		if(a>=c){
			if(b>=d){
				if(a<=d)
				count+=(d-a);
				else
					;
			}
			else
			count+=(b-a);
		}
		else if(b>=d){
			count+=(d-c);
		}
			else if(b>=c)
		count+=(b-c);
			else ;
		
		
		System.out.println(count);
		
			
	}

}
