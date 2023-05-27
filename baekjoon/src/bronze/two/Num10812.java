package bronze.two;

import java.util.Arrays;
import java.util.Scanner;

public class Num10812 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numOfBuck = scan.nextInt(); // 바구니 수
		int numOfTry = scan.nextInt(); // 시도 횟수
		
		int[] buckArr = new int[numOfBuck]; // 바구니 배열 생성 		
		for(int i = 0; i < numOfBuck; i++) { //바구니 초기화
			buckArr[i] = i+1;
		}

		// 반복문 시작
		for(int j = 0; j < numOfTry; j++) {
			
			// 바구니 순서를 어떻게 회전시킬지 입력받기
			// 상자에 적힌 숫자에서 1씩 빼서 배열 넘버랑 동일하게 하기
			int beginNum = scan.nextInt() - 1;
			int endNum = scan.nextInt() - 1; 
			int midNum = scan.nextInt() - 1; 
			
			int[] arrFirst = Arrays.copyOfRange(buckArr, 0, beginNum);
			int[] arrSecond = Arrays.copyOfRange(buckArr, midNum, endNum+1); // 바구니회전을 할 때 두 번째에 와야 할 부분
			int[] arrThird = Arrays.copyOfRange(buckArr, beginNum, midNum); // 바구니회전을 할 때 세 번째에 와야 할 부분
			int[] arrFourth = Arrays.copyOfRange(buckArr, endNum+1, numOfBuck);
			
			//System.arraycopy(복사할원본,시작인덱스(0),저장할 배열, 저장할 배열 시작인덱스, 요소개수)
			System.arraycopy(arrFirst, 0, buckArr, 0, arrFirst.length);
			System.arraycopy(arrSecond, 0, buckArr, arrFirst.length, arrSecond.length);
			System.arraycopy(arrThird, 0, buckArr, arrFirst.length + arrSecond.length, arrThird.length);
			System.arraycopy(arrFourth, 0, buckArr, arrFirst.length + arrSecond.length + arrThird.length, arrFourth.length);		
		}
		
		for(int k = 0; k < numOfBuck; k++) {
			System.out.printf("%d ", buckArr[k]);
		}
		
		scan.close();
		
	}

}
