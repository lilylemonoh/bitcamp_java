import java.util.ArrayList;
import java.util.Arrays;

public class JumpToJava07Q2 {

	public static void main(String[] args) {
		int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3];
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0);
            int e = 4 / 0;
        } catch (ClassCastException e) {
            result += 1;
        } catch (ArithmeticException e) {
            result += 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3;
        } finally {
            result += 4;
        }
        System.out.println(result); // result 의 값은 무엇일까?
        //10번 라인에서 ArrayIndexOutOfBoundsException 예외가 발생하여 이후 11~13번 실행 안 됨.
        //catch 중 18번 실행되어 result = 3; 20번 finally 실행되어 result = 3+4; 답은 7.
	}

}
