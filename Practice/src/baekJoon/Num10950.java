package baekJoon;

import java.util.Scanner;

public class Num10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testNum = scan.nextInt();
		
		for(int i = 0; i < testNum; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A+B);
			
		}
		
		scan.close();
	}
}
