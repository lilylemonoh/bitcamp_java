package bronze.five;

import java.util.Scanner;

public class Num9086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt(); 
		for(int i = 0; i < testCase; i++) {
			String text = scan.next();
			int textLength = text.length();
			char firstChar = text.charAt(0);
			char lastChar = text.charAt(textLength-1);
			
			System.out.printf("%c%c%n", firstChar, lastChar);
		}

	}

}
