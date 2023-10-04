import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
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
    	char[] C = sc.next().toCharArray();
    	int ans = 0;
    	for (int i = 0; i < C.length / 2; i++) {
//    		out.println("C[" + i + "] = " + C[i]);
//    		out.println("C[" + (C.length - i - 1) + "] = " + C[C.length - i - 1]);
			if(C[i] != C[C.length - i - 1])		ans++;
		}
    	out.println(ans);
    }
    // ==================================================================
}
