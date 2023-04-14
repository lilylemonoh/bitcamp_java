package chap4;

public class Chap4_4 {

	public static void main(String[] args) {
		String[] numbers2 = {"one", "two", "three"};
		for(int i = 0; i < numbers2.length; i++) {
		    System.out.println(numbers2[i]);
		}
		
		int[] marks2 = {90, 25, 67, 45, 80};
		for(int i = 0; i < marks2.length; i++) {
		    if (marks2[i] >= 60) {
		        System.out.println((i + 1)+"번 학생은 합격입니다.");
		    }else {
		        System.out.println((i + 1)+"번 학생은 불합격입니다.");
		    }
		}
		
		for(int i = 0; i < marks2.length; i++) {
		    if (marks2[i] < 60) {
		        continue;  
		    }
		    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}
		
		for(int i = 2; i < 10; i++) {
		    for(int j = 1; j < 10; j++) {
		        System.out.print(i*j+" ");
		    }
		    System.out.println(""); 
		}
		
		
		
		
	}

}
