package random_stuff;
import bookpack.Book;

class UseBook {
	public static void main(String[] args) {
		Book books[] = new Book[2];
		
		books[0] = new Book("JAV", "Bill", 2014);
		books[1] = new Book("ALG", "Beth", 2012);
		
		books[0].show();
		books[1].show();
	}
}
