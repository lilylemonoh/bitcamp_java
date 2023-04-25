package baekJoon;

import java.util.Scanner;

public class Num10952 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0) {
				return;
			}else {
				System.out.println(a+b);
			}
		}

	}

}
