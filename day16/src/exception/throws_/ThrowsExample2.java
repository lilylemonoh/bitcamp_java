package exception.throws_;

public class ThrowsExample2 {

	public void aaa(int n) throws Exception {
		System.out.println("aaa 호출");
		int i = 10 / n;
		System.out.println("계산 결과 : " + i);
		System.out.println("aaa 실행 종료");
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb 호출");
		aaa(0);
		System.out.println("bbb 실행 종료");
	}
	
	public void ccc() throws Exception {
		System.out.println("ccc 호출");
		bbb();
		System.out.println("ccc 실행 종료");
	}
	
	public ThrowsExample2() throws Exception {
		System.out.println("생성자 호출");
		ccc();
		System.out.println("생성자 실행 종료");
	}
	
	public static void main(String[] args) {
		try {
			ThrowsExample2 te = new ThrowsExample2();
		}catch(Exception e) {
			e.printStackTrace(); //추적 가능
			System.err.println("예외가 발생했어요"); // 몇번 라인에서 예외가 발생했는지 알 수 없다.
		}

	}

}
