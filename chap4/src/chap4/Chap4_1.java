package chap4;

import java.util.ArrayList;

public class Chap4_1 {

	public static void main(String[] args) {
		boolean money2 = true;
		if (money2) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		
		int x2 = 3;
		int y2 = 2;
		System.out.println(x2 > y2);
		System.out.println(x2 < y2);
		System.out.println(x2 == y2);
		System.out.println(x2 != y2);
		
		int money_2 = 2000;
		if (money_2 >= 3000) {
			System.out.println("택시를 타고 가라");
			} else {
				System.out.println("걸어가라");
			}
		
		boolean hasCard2 = true;
		if (money_2 >= 3000 || hasCard2) {
			System.out.println("택시를 타고 가라");
			} else {
				System.out.println("걸어가라");
			}		
		
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
			} else {
				System.out.println("걸어가라");
			}
		
		
		
		
	}//main 끝

}
