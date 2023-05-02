package bronze.one;

import java.util.Scanner;

public class Num1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfSubjects = scan.nextInt(); 
		
		int[] score = new int[numOfSubjects];
		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		//최대값 구하기
		int max = score[0];
		for(int i = 1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}		
		// 조작한 점수 합계 구하기
		float sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum = sum + ((float)score[i]/max)*100;
		}
		float newScore = (float)sum/score.length;
		
		System.out.println(newScore);
		
		scan.close();
	}

}
