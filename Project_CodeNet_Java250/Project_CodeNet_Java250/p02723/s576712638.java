import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		boolean jubge=false;
		
		if((str.charAt(2))==(str.charAt(3))
				&&(str.charAt(4))==(str.charAt(5))){
				System.out.println("Yes");	
		}
		
		else System.out.println("No");
	}
}