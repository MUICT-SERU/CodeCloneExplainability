import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;


class Main {
  public static void main(String[] args) {
    //input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    Deque<MyProcess> d = new ArrayDeque<MyProcess>();
    for(int i = 0; i < n; ++i) {
    	String name = sc.next();
    	int time = sc.nextInt();
    	d.add(new MyProcess(name, time));
    }
    
    int elapsed = 0;
    while(!d.isEmpty()){
    	 MyProcess p = d.removeFirst();
    	 if(p.time > q) {
	    	elapsed += q;
	    	d.add(new MyProcess(p.name, p.time - q));
    	 }else{
    	 	elapsed += p.time;
    	 	System.out.println(p.name + " "  + elapsed);
    	 }
    }
  }
}

class MyProcess {
	public String name;
	public int time;
	public MyProcess(String n, int t) {
		name = n;
 		time = t;
 	}
 }