package baekJoon;

import java.util.Scanner;

public class Num11022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 1;i <= T ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();			
			int sum = a+b;
			System.out.printf("Case #%d: %d + %d = %d%n", i,a, b, sum);
		}
		scan.close();

	}

}
