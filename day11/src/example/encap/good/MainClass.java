package example.encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyBirthday mb = new MyBirthday(2025, 16, 99);
		
		// 접근제한자 private이므로 직접 수정 불가.
//		mb.day = 105;
//		mb.month = 33;
		
		mb.showDateInfo();
		System.out.println(mb.getDay());
		// getter의 역할 : 조회만 할 때
	}	// 조회조차 하면 안 되는 데이터는 getter도 안 만든다. (암호, 시리얼넘버..)

}
