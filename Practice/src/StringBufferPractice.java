
public class StringBufferPractice {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		
		

//		String result1 = "";
//		result1 += "hello";
//		result1 += " ";
//		result1 += "jump to java";
//		System.out.println(result1);
		
		sb.insert(0, "hi ");
		
		
		String result = sb.toString();
		System.out.println(sb.substring(0,4));
		
	}

}
