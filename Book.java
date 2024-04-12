package inheritance;

import java.util.Comparator;
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
	
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}
	
	static final Comparator<Book> NAME_ORDER = new Comparator<Book>() {
		public int compare(Book a, Book b) {
			return a.title.compareTo(b.title);
		}
	};
	
	//in form MM/DD/YYYY
	static final Comparator<Book> PUBLISH_MONTH = new Comparator<Book>() {
		public int compare(Book a, Book b) {
			if(a.month < b.month) {
				return -1;
			}
			else if(a.month > b.month) {
				return 1;
			}
			else {
				return 0;
			}
		}
	};
	
	static final Comparator<Book> PUBLISH_DAY = new Comparator<Book>() {
		public int compare(Book a, Book b) {
			if(a.day < b.day) {
				return -1;
			}
			else if(a.day > b.day) {
				return 1;
			}
			else {
				return 0;
			}
		}
	};
	
	static final Comparator<Book> PUBLISH_YEAR = new Comparator<Book>() {
		public int compare(Book a, Book b) {
			if(a.year < b.year) {
				return -1;
			}
			else if(a.year > b.year) {
				return 1;
			}
			else {
				return 0;
			}
		}
	};
}
