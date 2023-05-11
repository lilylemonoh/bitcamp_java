package bronze.two;

import java.util.Scanner;

public class Num10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String keyWord = scan.next() ;
		
		for(int i = 97; i <= 122; i++) {
			int idx = keyWord.indexOf((char)i); 
			System.out.printf("%d ", idx);
		}
		

	}

}
