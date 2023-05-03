package bronze.five;

import java.util.Scanner;

public class Num27866 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		int nth = scan.nextInt();
		
		char nthChar = word.charAt(nth-1);
		System.out.println(nthChar);
	}

}
