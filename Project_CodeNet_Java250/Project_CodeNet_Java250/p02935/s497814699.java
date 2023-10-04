import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
       ArrayList<Integer> vList= new ArrayList<>();
         
		for(int i = 0; i < n; i++) {
          vList.add(sc.nextInt());
        }
        Collections.sort(vList);
        
        double ans = (double)vList.get(0);
        for (int i = 1; i < n; i++) {
          double sum = ans + (double)vList.get(i);
          ans = sum / 2;
        }
    
		// 出力
		System.out.println(ans);
	}
}