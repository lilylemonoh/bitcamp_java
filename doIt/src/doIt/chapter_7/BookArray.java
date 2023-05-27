package doIt.chapter_7;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0] = new Book("태", "조");
		library[1] = new Book("데", "헤");
		library[2] = new Book("어", "유");
		library[3] = new Book("토", "박");
		library[4] = new Book("어", "생");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
	
}
