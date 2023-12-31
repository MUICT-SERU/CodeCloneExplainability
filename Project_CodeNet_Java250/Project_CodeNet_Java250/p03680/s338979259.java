import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] buttons = new int[n];
		for(int i=0;i<n;i++){
			buttons[i] = sc.nextInt();
		}
		sc.close();
		
		int glowinBtn = 1;
		Set<Integer> pshdBtn = new HashSet<Integer>();
		do{
			pshdBtn.add(glowinBtn);
			glowinBtn = buttons[glowinBtn-1];
			
		}while(!(glowinBtn==2 || pshdBtn.contains(glowinBtn)));
		
		int result = -1;
		
		if(glowinBtn==2){
			result = pshdBtn.size();
		}
		
		System.out.print(result);
		
		return;
	}
}