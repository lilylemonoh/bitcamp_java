package baekJoon;

import java.util.Scanner;

public class Num2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int one = a*(b%10);
	    int two = a*((b%100)/10);
		int three = a*(b/100);
				
		System.out.println(one);
		System.out.println(two); 
		System.out.println(three);
		System.out.println(one+(two*10)+(three*100));
	}

}
