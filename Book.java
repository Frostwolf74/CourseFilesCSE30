package inheritance;

import java.util.Scanner;

public class Book implements Comparable<Book> {
	static Scanner input = new Scanner(System.in);
	
	private String title, author;
	private int issueNumber, month, day, year;
	
	public Book(String title, String author, int issueNumber, int month, int day, int year) {
		this.title = title;
		this.author = author;
		this.issueNumber = issueNumber;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public Book() {
		System.out.println("Enter book title: ");
		title = input.nextLine();
		System.out.println("Enter Author: ");
		author = input.nextLine();
		input.nextLine();
		System.out.println("Enter issue #: ");
		issueNumber = input.nextInt();
		System.out.println("Enter pubish month: ");
		month = input.nextInt();
		System.out.println("Enter publish day: ");
		day = input.nextInt();
		System.out.println("Enter publish year: ");
		year = input.nextInt();
	}

	@Override
	public int compareTo(Book o) {
		
		return 0;
	}
}
