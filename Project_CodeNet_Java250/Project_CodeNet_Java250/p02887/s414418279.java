import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int sum = 0;
		String s=sc.nextLine()+'Z';
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)!=s.charAt(i+1))
				sum++;
		}
		System.out.println(sum);
	}
}