import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		HashSet<String> color = new HashSet<>();
		int unknown = 0;
		int max = 0;
		int min = 0;
		num.remove(0);

		for(int i = 0; i < num.size(); i++){
			if(num.get(i) < 400){
				color.add("gray");
			}else if(num.get(i) < 800){
				color.add("brown");
			}else if(num.get(i) < 1200){
				color.add("green");
			}else if(num.get(i) < 1600){
				color.add("aqua");
			}else if(num.get(i) < 2000){
				color.add("blue");
			}else if(num.get(i) < 2400){
				color.add("yellow");
			}else if(num.get(i) < 2800){
				color.add("daidai");
			}else if(num.get(i) < 3200){
				color.add("red");
			}else if(num.get(i) >= 3200){
				unknown++;
			}
		}
		max = color.size() + unknown;

		min = color.size();
		if(min == 0 && unknown > 0) min = 1;

		System.out.print(min + " " + max);
	}
}