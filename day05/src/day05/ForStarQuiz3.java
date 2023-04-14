package day05;
import java.util.Scanner;

public class ForStarQuiz3 {
	//    *
	//   **
	//  ***
	// ****
	//*****
	public static void main(String[] args) {
	//boh 2439	
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = n-i; j >= 0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i ; k++) {
				System.out.print("*");
			}
		
			System.out.println();
		} //외부 for문 끝
		
		
		
		
		
		
		
		

	}//main 끝

}
