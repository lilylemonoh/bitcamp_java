package day05;

public class ForStarQuiz3_3 {

	public static void main(String[] args) {
		
		 for(int i = 1; i <=5; i++) {
			  	for(int j = 1; j <= 5; j++) {
			  		if(i <= 5-j) {
			  			System.out.print(" "); }
			  		else  {
			  			System.out.print("*");
			  			}
			  		}
			  	System.out.println();
			  	
		 }//외부 for문 끝	
}
}



	

