package poly.casting;

public class MainClass2 {

	public static void main(String[] args) {
		// Parent 타입에는 Child, Child2 모두 대입 가능
		Parent p1 = new Child();
		p1.method2();
		// Parent 타입으로는
		// Child의 method도, Child2의 method2도 호출 가능
		// method2는 Parent에도 정의되어 있지만 Child와 
		// Child2에도 정의된 오버라이딩(재정의)된 메서드이기 때문에
		// 호출 가능함
		
		p1 = new Child2();
		p1.method2();
		// 오버라이딩이 전제되지 않은 method3은 호출 불가능		
//		p1.method3();
//		p2.method3();
		
		Child c1 = new Child();
		// Parent 타입과는 달리 Child는 Child 인스턴스만 대입 가능
		// Child c2 = new Child2();
		
		
	}
}
