package day05;

import java.util.Scanner;
public class ForStarQuiz3_2 {

	//     *
	//    **
	//   ***
	//  ****
	// *****
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		scan.close();
				
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= 1; j--)
						
			if(j>i) {
				System.out.print(" ");
			}
				
			else {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
/*
 * for(int i = 1; i <=5; i++ {
 * 	for(int j = 1; j <= 5; j++ {
 * 		if(i <= 5-j) {
 * 			System.out.print(" ");
 * 		else 
 * 			System.out.print("*");
 * 		}
 * 		System.out.println();
 * 
 * 
 * 
 * 
 * 
 * 
 */


