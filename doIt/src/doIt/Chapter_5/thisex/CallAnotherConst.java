package doIt.Chapter_5.thisex;

//class Person {
//	String name;
//	int age;
//	
//	Person(){
//		this("이름없음", 1); // this로 다른 생성자 호출하기
//	}
//	
//	Person(String name, int age){
//		this.name = name;
//		this.age = age;
//	
//}
//
//}
public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

	}

}
