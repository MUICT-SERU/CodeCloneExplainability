//?????????????????¨
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		int w=kb.nextInt(),h=kb.nextInt(),
				x=kb.nextInt(),y=kb.nextInt(),
				r=kb.nextInt();
		if(x>=r&&y>=r&&
				x+r<=w&&y+r<=h){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}