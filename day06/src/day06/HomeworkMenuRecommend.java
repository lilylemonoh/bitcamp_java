package day06;

public class HomeworkMenuRecommend {

	public static void main(String[] args) {

		
		String[] menu = {"마라탕", "돈까스", "제육볶음", "된장찌개", "라멘", "초밥", "파스타", "햄버거", 
				"잔치국수", "비빔밥", "냉면", "김밥", "뼈해장국", "순대국밥", "설렁탕", "한식뷔페", "부대찌개",
				"샌드위치", "쌀국수", "우육면", "부리또볼", "도삭면", "떡볶이", "카레"}; //24종
				
		int n = (int)(Math.random()*24); //0~23
	
		System.out.println(menu[n]);
	}//main의 끝

}
