public class FinalRelated {
	
	public static final String[] FINAL_ARRAY = {"배열의", "내용을", "수정할 수", "있을까"};
	
	public static void main(String[] args) {
		FINAL_ARRAY[3] = "있다"; 
			for (int i = 0; i < FINAL_ARRAY.length; i++) {
			System.out.print(FINAL_ARRAY[i] + " ");
			}
			}
}

