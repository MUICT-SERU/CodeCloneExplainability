import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int counter = 0;
		int currentHighestLength = 0;
		
		while (counter < str.length()) {
			int testLength = 1;
			currentHighestLength = 0;
			if (str.charAt(counter) == 'A') {
				while (counter + testLength < str.length()) {
					if (str.charAt(counter + testLength) == 'Z' && testLength + 1 > currentHighestLength) {
						currentHighestLength = testLength + 1;
						testLength++;
					} else {
						testLength++;
					}
				}
				counter = str.length();
			} else {
				counter++;
			}
		}
		System.out.println(currentHighestLength);
	}

}