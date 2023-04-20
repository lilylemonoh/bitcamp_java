package baekJoon;

import java.util.Scanner;

public class Num2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int alarmM = 0;
		int alarmH = 0;
		
		//M이 45보다 큰 경우 
		if(M >= 45) {
			System.out.printf("%d %d", H, M-45);
			return;
		}else if(H != 0) { //M이 45보다 작고 H가 0이 아닌 경우
			alarmM = (M + 60)-45;
			alarmH = H-1;
			System.out.printf("%d %d", alarmH, alarmM);
		}else { // M이 45보다 작고 H가 0인 경우
			alarmM = (M + 60)-45;
			alarmH = 23;
			System.out.printf("%d %d", alarmH, alarmM);
		}
		
		
	}

}
