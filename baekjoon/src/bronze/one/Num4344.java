package bronze.one;

import java.util.Scanner;

public class Num4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();

		//반복문 시작
		for(int i = 0; i < testCase; i++) {
			int numOfStudent = scan.nextInt(); 
			int sum = 0;
			//점수를 담을 배열 생성
			int[] scores = new int[numOfStudent];			
			for(int j = 0; j < numOfStudent; j++) {
				scores[j] = scan.nextInt();
				sum += scores[j];
			}// 내부 for문 1 끝
			//평균 구하기
			double avg = (double)sum / numOfStudent;
			// 평균 넘는 학생 수 저장할 변수 초기화
			int overAvg = 0;
			for(int k = 0; k < numOfStudent; k++) {
				if(scores[k] > avg) {
					overAvg++;
				}
			}// 내부 for문 2 끝
			// 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한 후 
			//for 문 탈출
			double overAvgRate = (double)overAvg / numOfStudent * 100;
			System.out.printf("%.3f%%\n", Math.round(overAvgRate*1000)/1000.0);
			
		}// 외부 for문 끝
		scan.close();

	}

}
