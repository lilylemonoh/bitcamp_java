package chap3;
import java.util.*;
public class Chap3_4 {

	public static void main(String[] args) {
		String a2 = "Happy Java";
		String b2 = "a";
		String c2 = "123";
		
		String a22 = new String("Happy Java"); // 항상 새로운 객체를 만드는 방법
		String b22 = new String("a");
		String c22 = new String("123");
		
		boolean result2 = true;
		char ac2 = 'A';
		int i2 = 100000;
		
		String aa2 = "hello";
		String bb2 = "java";
		String cc2 = "hello";
		System.out.println(aa2.equals(bb2));
		System.out.println(aa2.equals(cc2));
		
		String e2 = "hello";
		String f2 = new String("hello");
		System.out.println(e2.equals(f2));
		System.out.println(e2 == f2);
		
		String g2 = "Hello Java";
		System.out.println(g2.indexOf("Java"));
		
		System.out.println(g2.contains("Java"));
		
		System.out.println(g2.charAt(6));
		
		System.out.println(g2.replaceAll("Java", "World"));
		
		System.out.println(g2.substring(0, 4));
		
		System.out.println(g2.toUpperCase());
		
		String h2 = "a:b:c:d";
		String[] result = h2.split(":"); // result는 {"a", "b", "c", "d"}
		
		System.out.println(String.format("I eat %d apples.",3));		
		System.out.println(String.format("I eat %s apples.","five"));
		
		int number2 = 3;
		System.out.println(String.format("I eat %d apples.", number2));
		
		int number22 = 10;
		String day2 = "three";
		System.out.println(String.format("I ate %d apples. so I was sick for %s day.", number22, day2));
		
		System.out.println(String.format("I have %s apples.", 3));
		System.out.println(String.format("rate is %s", 3.234));
		
		System.out.println(String.format("%10s", "hi"));
		System.out.println(String.format("%-10sjane.", "hi"));
		
		System.out.println(String.format("%.4f",3.42134234 ));
		System.out.println(String.format("%10.4f",3.42134234 ));
		
		System.out.printf("I eat %d apples.", 3);
		
		

	}

}
