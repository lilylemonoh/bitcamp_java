package bronze.two;

import java.util.Scanner;

public class Num10813 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberOfBaskets = scan.nextInt();
		int tryCount = scan.nextInt();
		
		int[] result = new int[numberOfBaskets];
		
		for(int a = 0; a < numberOfBaskets; a++) {
			result[a] = a+1;
		} 
		
		for(int x = 0; x < tryCount; x++) {
			int i = scan.nextInt(); 
			int j = scan.nextInt(); 
			int t = 0; //바꾸기 할 때 저장할 변수
			t = result[i-1];
			result[i-1] = result[j-1];
			result[j-1] = t;
		}

		for(int y = 0; y < numberOfBaskets; y++) {
			System.out.print(result[y] + " ");
		}
		
		scan.close();
	}

}
