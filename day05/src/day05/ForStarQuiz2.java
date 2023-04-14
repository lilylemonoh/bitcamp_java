package day05;

import java.util.Scanner;
public class ForStarQuiz2{
    public static void main(String[] args){
        // *****
    	// ****
    	// ***
    	// **
    	// *
    	// boj 2440
    	// 역으로 5개부터 1개로 줄어드는 별찍기를 하려면
    	// 바깥쪽 for문이 5부터 시작해서 1까지 도달하도록 해야합니다.

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.close();
        
        for(int i = n; i >= 1; i--) {
        	
        	for(int j = 1; j <= i; j++) {
        		System.out.print("*");
        	}
        System.out.println();
        } 
    	
	}// main 끝

}


//        for(int i = 1; i <= n; i++) {
//        	
//            for(int j = 0; j <= n-i; j++) {        
//                System.out.print("*");
//            }
//            System.out.println();
        

