package bronze.two;

import java.util.Scanner;

public class Num5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String dial = scan.next();
		int sum = 0;
		
		// 입력 길이만큼 배열생성, 초기화
		char[] dialArr = new char[dial.length()];
		for(int i = 0; i < dial.length(); i++) {
			dialArr[i] = dial.charAt(i); 
			
			switch(dialArr[i]) {
			
			case 'A': case 'B': case 'C' :
				sum += 3;
				break;
			case 'D': case 'E': case 'F' :
				sum += 4;
				break;
			case 'G': case 'H': case 'I' :
				sum += 5;
				break;
			case 'J': case 'K': case 'L' :
				sum += 6;
				break;
			case 'M': case 'N': case 'O' :
				sum += 7;
				break;
			case 'P' : case 'Q': case 'R': case 'S' :
				sum += 8;
				break;
			case 'T': case 'U': case 'V' : 
				sum += 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				sum += 10;
				break;
			}//switch문 끝	
		}//for문 끝
		System.out.println(sum);
	}

}
