import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(4 - in.nextLine().replace("+", "").length() * 2);
	}
}
