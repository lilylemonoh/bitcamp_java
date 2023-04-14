package day06;

public class MenuRecommendBlog {

	public static void main(String[] args) {

		
		String[] menu = {"A해장국", "B냉면", "C분식", "D중국집", "E돈까스", "F곰탕" }; //6종
				
		int idx = (int)(Math.random()*6); //0~5
//		int idx = (int)(Math.random()*menu.length); 
	
		
		
		System.out.println(menu[idx]);
		
		
	}//main의 끝

}
