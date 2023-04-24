package baekJoon;

import java.util.Scanner;

public class Num25314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = a/4; i >=1; i-- ) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		scan.close();

	}

}
