import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < N; i++){
        	set.add(sc.next());
        }
        sc.close();
        System.out.println(set.size());
    }
}