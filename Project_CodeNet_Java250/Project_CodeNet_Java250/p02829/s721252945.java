import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
 
import static java.util.Comparator.*;
 
public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==================================================================
    public void solve() {
    	int A = Integer.parseInt(sc.next());
    	int B = Integer.parseInt(sc.next());
    	if(A == 1 && B == 2)		out.println(3);
    	else if(A == 1 && B == 3)	out.println(2);
    	else if(A == 2 && B == 1)	out.println(3);
    	else if(A == 2 && B == 3)	out.println(1);
    	else if(A == 3 && B == 1)	out.println(2);
    	else if(A == 3 && B == 2)	out.println(1);
    }
}