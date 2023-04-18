package exception.trycatch;

import java.util.Scanner;

public class NoTryCatchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int prevValue = scan.nextInt();
		int nextValue = scan.nextInt();
		
		// nextValue에 0만 안 들어오면 예외 발생 없음.
		if(nextValue != 0) {		
			System.out.println(prevValue / nextValue);
		} else {
			System.out.println("0을 나누는 값으로 넣을 수 없습니다.");
		}
		// 예외처리는 되지만, 시각적으로 예외처리를 한 건지 아닌지 읽어보지 않으면 알 수 없다
		
		scan.close();
	}

}
