package bronze.four;

import java.util.Scanner;

public class Num11720 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numCount = scan.nextInt(); // 25
		String numbers = scan.next();  //70~~~~~
				
		String[] arr = new String[numCount]; //25개 배열 생성
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) { //25번 실행
			arr[i] = "" + numbers.charAt(i);
			
			
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
		
	}

}
