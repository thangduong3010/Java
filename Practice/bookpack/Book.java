package bookpack;

public class Book {
	protected String title;
	protected String author;
	protected int pubDate;
	
	public Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	public void show() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Publish: " + pubDate);
	}
}
