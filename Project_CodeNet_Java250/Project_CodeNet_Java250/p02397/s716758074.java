import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer[]> num = new ArrayList<Integer[]>();
		int x;
		int y;
		Scanner sc = new Scanner(System.in);

		//??\??????????????????0 0?????§??°?????????
		while (sc.hasNext()) {
			x=sc.nextInt();
			y=sc.nextInt();
			Integer[] sort = new Integer[2];
			sort[0]=x;
			sort[1]=y;

			//0??\??????????????????
			if(x==0 && y==0){
				break;
			}
			//??\???????????´??°??????????????????
			Arrays.sort(sort);
			num.add(sort);
		}
		//??\???????????´??°?????¨???
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i)[0]+" "+num.get(i)[1]);
		}
	}
}