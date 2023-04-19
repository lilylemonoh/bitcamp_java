package baekJoon;

import java.util.Scanner;

public class Num10430 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.printf("%d%n%d%n%d%n%d", (a+b)%c, ((a%c) + (b%c))%c, (a*b)%c, ((a%c)*(b%c))%c );
	}

}

