package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookShelf {	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Book> b = new ArrayList<Book>();
				//string, string, int, int, int int
		b.add(new Adventure("Book1", "Author1", 1, 01, 01, 2001, "A"));
		b.add(new Book("Book5", "Author5", 9, 02, 01, 2014));
		b.add(new Book("Book3", "Author3", 2, 06, 02, 2003));
		b.add(new Adventure("Book4", "Author2", 5, 04, 11, 2015, "B"));
		b.add(new Book("Book2", "Author2", 2, 06, 12, 2006));
		
		System.out.println("Sorted by name:");
		Collections.sort(b, Book.NAME_ORDER);
		
		printArray(b);
		
		System.out.println("\n\nSorted by month: ");
		Collections.sort(b, Book.PUBLISH_MONTH);
		
		printArray(b);
		
		System.out.println("\n\nSorted by day: ");
		Collections.sort(b, Book.PUBLISH_DAY);
		
		printArray(b);
		
		System.out.println("\n\nSorted by year: ");
		Collections.sort(b, Book.PUBLISH_YEAR);
		
		printArray(b);
	}
	
	public static void printArray(ArrayList<Book> b) {
		for(int i = 0; i < 5; ++i) {		
			System.out.println("Title: " + b.get(i).getTitle());
			System.out.println("Issue #: " + b.get(i).getIssueNumber());
		
			if(b.get(i) instanceof Adventure) {
				System.out.println("Series: " + ((Adventure) b.get(i)).getSeries());
			}
			
			System.out.printf("Publish date: %d-%d %d\n\n", b.get(i).getMonth(), b.get(i).getDay(), b.get(i).getYear());
			// NA format MM/DD/YYYY
		}
	}
}
