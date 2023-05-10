package bronze.two;

import java.util.Scanner;

public class Num2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String firstNum = (String)scan.next(); //"734"
		String secondNum = scan.next(); //"893"
		
		String firstNumBackwards;
		String secondNumBackwards;
		
		char firstHundth = firstNum.charAt(0); // '7'
		char firstTenth = firstNum.charAt(1);  // '3'
		char firstOneth = firstNum.charAt(2);  // '4'
		
		firstNumBackwards = "" + firstOneth + firstTenth + firstHundth;
		
		char secondHundth = secondNum.charAt(0); // '7'
		char secondTenth = secondNum.charAt(1);  // '3'
		char secondOneth = secondNum.charAt(2);  // '4'
		
		secondNumBackwards = "" + secondOneth + secondTenth + secondHundth;

		
		if(Integer.parseInt(firstNumBackwards) > Integer.parseInt(secondNumBackwards)) {
			System.out.println(firstNumBackwards);
		} else {
			System.out.println(secondNumBackwards);
		}

	}

}
