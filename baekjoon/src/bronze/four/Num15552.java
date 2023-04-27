package bronze.four;

import java.util.Scanner;

public class Num15552 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Testcase = scan.nextInt();
		for(int i=0; i < Testcase; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		scan.close();
	}

}
