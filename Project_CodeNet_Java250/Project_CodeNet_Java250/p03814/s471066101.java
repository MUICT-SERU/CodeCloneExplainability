import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char st[] = new char[str.length()];
        int ans=0;
        for(int i=0;i<str.length();i++){
        	st[i] = str.charAt(i);
        }
        for(int i=0; i<st.length;i++){
        	if('A'==st[i]){
        		for(int f = i; f<st.length;f++){
        			if('Z'==st[f]){
        				ans = f - i+1;
        			}
        		}break;
        	}
        }
        System.out.println(ans);
	}

}
