import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		sb.append(s);
		
		while(true){
			int i = sb.indexOf(sb.substring(0, 1),1);
			if(i==-1){
				System.out.println("No");
				break;
			}
			sb.deleteCharAt(i);
			sb.deleteCharAt(0);
			if(sb.length()==0){
				System.out.println("Yes");
				break;
			}
		}
		
	}

}