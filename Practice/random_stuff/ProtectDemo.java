package random_stuff;
import bookpack.Book;

class ExtBook extends Book {
	private String publisher;
	
	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publisher = p;
	}
	
	public void show() {
		super.show();
		System.out.println("Publisher: " + publisher);
		System.out.println();
	}
	
	public String getPublisher() { return publisher; }
	public void setPublisher(String p) { publisher = p; }
	
	// subclass can access protected members.
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	public String getAuthor() { return author; }
	public void setAuthor(String a) { author = a; }
	public int getPubDate() { return pubDate; }
	public void setPubDate(int d) { pubDate = d; }
}

class ProtectDemo {
	public static void main(String[] args) {
		ExtBook books[] = new ExtBook[5];
		books[0] = new ExtBook("Java: A Beginner's Guide",
		"Schildt", 2014, "McGraw-Hill Professional");
		books[1] = new ExtBook("Java: The Complete Reference",
		"Schildt", 2014, "McGraw-Hill Professional");
		books[2] = new ExtBook("The Art of Java",
		"Schildt and Holmes", 2003,
		"McGraw-Hill Professional");
		books[3] = new ExtBook("Red Storm Rising",
		"Clancy", 1986, "Putnam");
		books[4] = new ExtBook("On the Road",
		"Kerouac", 1955, "Viking");
		
		for(int i = 0; i < books.length; i++) books[i].show();
		
		System.out.println("All books by Schildt:");
		for(int i = 0; i < books.length; i++)
			if(books[i].getAuthor() == "Schildt")
				System.out.println("\t" + books[i].getTitle());
		
		// books[0].title = "Argh"; - Error! Not accessible by non-subclass
		// instead we must use this
		books[0].setTitle("Argh");
		System.out.println("New title: " + books[0].getTitle());
	}
}
