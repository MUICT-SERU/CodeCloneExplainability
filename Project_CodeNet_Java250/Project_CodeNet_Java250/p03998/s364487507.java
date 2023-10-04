import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		D[] deques = new D[3];
		for(int i=0;i<3;i++) {
			deques[i]=new D();
			for(char c:s.next().toCharArray())
				deques[i].add(c);
		}
		char next='a';
		while(!deques[next-'a'].isEmpty()) {
			next=deques[next-'a'].poll();
		}
		System.out.println(Character.toUpperCase(next));
	}
	static class D extends ArrayDeque<Character>{}
}