package doIt.chapter_7;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("이기적 유전자", "찰스도킨스"));
		library.add(new Book("로미오와 줄리엣", "셰익스피어"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("==향상된 for문 ==");
		for(Book book : library) {
			book.showBookInfo();
		}

	}

}
