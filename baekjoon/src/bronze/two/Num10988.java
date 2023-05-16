package bronze.two;

import java.util.Scanner;

public class Num10988 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		int half = word.length() / 2;
		String halfFrontWord = word.substring(0,half);
		String halfBackWord; 
		if(word.length() % 2 == 0) {
			halfBackWord = word.substring(half);
		} else {
			halfBackWord = word.substring(half+1);
		}
		
		StringBuffer sb = new StringBuffer(halfBackWord);
		sb.reverse();
		String reverseHalfBackWord = sb.toString();
		
		if(halfFrontWord.equals(reverseHalfBackWord)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		scan.close();
	}

}
