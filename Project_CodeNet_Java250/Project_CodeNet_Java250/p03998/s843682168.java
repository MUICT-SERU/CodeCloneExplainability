import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Sa=sc.next();
		String Sb=sc.next();
		String Sc=sc.next();
		StringBuilder SBa=new StringBuilder(Sa);
		StringBuilder SBb=new StringBuilder(Sb);
		StringBuilder SBc=new StringBuilder(Sc);
		String abc=SBa.substring(0, 1);
		SBa.delete(0, 1);
		
		while(true){
			if(abc.equals("a")){
				if(SBa.length()==0){
					System.out.println("A");
					return;
				}
				abc=SBa.substring(0,1);
				SBa.delete(0,1);
			}else if(abc.equals("b")){
				if(SBb.length()==0){
					System.out.println("B");
					return;
				}
				abc=SBb.substring(0,1);
				SBb.delete(0, 1);
			}else if(abc.equals("c")){
				if(SBc.length()==0){
					System.out.println("C");
					return;
				}
				abc=SBc.substring(0,1);
				SBc.delete(0, 1);
			}
		}
	}
}
