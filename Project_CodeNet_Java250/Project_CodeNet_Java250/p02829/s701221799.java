import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (B < A) {
            int w = A;
            A = B;
            B = w;
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.remove(A - 1);
        list.remove(B - 2);
        
        System.out.println(list.get(0));
        
    }
    
}
