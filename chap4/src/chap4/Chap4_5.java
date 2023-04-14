package chap4;
import java.util.ArrayList;
import java.util.Arrays;


public class Chap4_5 {
	public static void main(String[] args) {
		String[] numbers2 = {"one", "two", "three"};
		for(String number2 : numbers2) {
			System.out.println(number2);
		}
		
		ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String number : numbers) {
			System.out.println(number);
		}
		
	}
}
