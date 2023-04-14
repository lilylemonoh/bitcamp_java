package chap3;

public class Chap3_6 {

	public static void main(String[] args) {
		int[] odds2 = {1, 3, 5, 7, 9};
		
		String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
		
		String[] week2 = new String[7];
		week2[0] = "월";
		week2[1] = "화";
		week2[2] = "수";
		week2[3] = "목";
		week2[4] = "금";
		week2[5] = "토";
		week2[6] = "일";

		// String[] weeks = new String[]; 
		// 길이에 대한 숫자값이 없으므로 컴파일 오류가 발생한다.
		
		System.out.println(weeks2[3]);
		
		for (int i = 0; i < weeks2.length; i++) {
			System.out.println(weeks2[i]);
		}
		
	}

}
