import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		boolean flag = true;
		for(int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			int count=0;
			for(char x: string.toCharArray()){
				if(x == c){
					count++;
				}
			}
			if(count % 2 == 1){
				System.out.println("No");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Yes");
		}
	}
}