import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		String target = cin.next();
		cin.close();
		int position_a=target.length();
		int position_z=0;

		for(int i=0;i<target.length();i++){
			if(target.charAt(i)=='A'){
				if(i<position_a){
					position_a=i;
				}
			}else if(target.charAt(i)=='Z'){
				if(position_z<i){
					position_z=i;
				}
			}
		}

		System.out.println(position_z-position_a+1);
	}
}
