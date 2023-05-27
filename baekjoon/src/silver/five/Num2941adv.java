package silver.five;

import java.util.Scanner;

public class Num2941adv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	
		String replaced = word.replaceAll("dz=", "d")
				.replaceAll("lj", "l")
				.replaceAll("nj", "n")
				.replaceAll("[=-]", ""); // '='와 '-'를 제거
		
		System.out.println(replaced.length());
			
		scan.close();
	}

}
