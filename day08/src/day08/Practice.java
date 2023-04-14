package day08;

class MyMath2 {
	int a, b;
	
	int add() {return a+b;}
	int sub() {return a-b;}
	int mul() {return a*b;}
	double div() {return a/(double)b;}
	
	static int add(int c, int d) {return c+d;}
	static int sub(int c, int d) {return c-d;}
	static int mul(int c, int d) {return c*d;}
	static double div(int c, int d) {return c/(double)d;}	
}

public class Practice {

	public static void main(String[] args) {

		System.out.println(MyMath2.add(1,2));
		System.out.println(MyMath2.sub(1,2));
		System.out.println(MyMath2.mul(1,2));
		System.out.println(MyMath2.div(1,2));
		
		MyMath2 mm = new MyMath2();
		mm.a = 3;
		mm.b = 4;
		
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());
		
		

		
		}//메인 메서드 끝
	

	

} //Practice 클래스의 끝

