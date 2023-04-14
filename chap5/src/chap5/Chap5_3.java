package chap5;

public class Chap5_3 {
	
	int sum(int a2, int b2) {
	return a2 + b2;
	}

	String say() {
		return "Hi";
	}
	
	void sum2(int a2, int b2) {
		System.out.println(a2 + "과 " + b2 + "의 합은 " + (a2+b2) + "입니다.");
	}
	
	void say2() {
		System.out.println("Hi");
	}
	
	void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은 " + nick + " 입니다.");
	}
	
	int varTest(int a2) {
		a2++;
		return a2;
	}
	
	int c2;
	
	void varTest(Chap5_3 sample2) {
		sample2.c2++;
		//this.c2++;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a2 = 3;
		int b2 = 4;
		
		Chap5_3 sample2 = new Chap5_3();
		int c2 = sample2.sum(a2, b2);
		
		System.out.println(c2);
		
		String d2 = sample2.say();
		System.out.println(d2);
		
		sample2.sum2(3, 4);
		sample2.say2();
		
		sample2.sayNick("angel");
		sample2.sayNick("fool");
		
		int e2 = 1;
		e2 = sample2.varTest(e2);
		System.out.println(e2);
		
		sample2.c2 = 1;
		sample2.varTest(sample2);
		System.out.println(sample2.c2);
		
		
	}
	
}

