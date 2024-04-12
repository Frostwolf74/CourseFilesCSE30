package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookShelf {	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Book> b = new ArrayList<Book>();
				//string, string, int, int, int int
		b.add(new Book("Book1", "Author1", 1, 01, 01, 2001));
		b.add(new Book("Book5", "Author5", 9, 02, 01, 2014));
		b.add(new Book("Book3", "Author3", 2, 06, 02, 2003));
		b.add(new Book("Book4", "Author2", 5, 04, 11, 2015));
		b.add(new Book("Book2", "Author2", 2, 06, 12, 2006));
		
		Collections.sort(b);
		
		for(int i = 0; i < 5; ++i) {
			System.out.println(b.get(i));
		}
	}
}
