package day04;


class MyMath2 {
	long a, b;
	
	long add() { return a + b; }
	long subtract() { return a = b;  }
	long multiply() { return a*b; }
	double divide() { return a/b; }
	
	static long add(long a, long b) {return a + b; }
	static long subtract(long a, long b) { return a = b;  }
	static long multiply(long a, long b) { return a*b; }
	static double divide(long a, long b) { return a/(double)b; }
}//MyMath2 끝

public class Practice {

	public static void main(String[] args) {

		//클래스 메서드 호출. 인스턴스 생성 없이 호출 가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
	
		MyMath2 mm = new MyMath2();
		
		mm.a = 200L;
		mm.b = 100L;
		//인스턴스 메서드는 객체 생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
		
		
		
	
}
}
