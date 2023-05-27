package doIt.chapter_2;

public class TypeInference_60 {

	public static void main(String[] args) {
		var i = 10; // int i = 10으로 컴파일됨
		var j = 10.0; //double j = 10.0으로 컴파일됨
		var str = "hello"; // String srt = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
				 
		str = "test"; 
//		str = 3;

	}

}
