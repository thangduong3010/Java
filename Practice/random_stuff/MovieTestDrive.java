package random_stuff;

public class MovieTestDrive {
	public static void main (String[] args){
		Movie one = new Movie();		
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		
		Movie two = new Movie();
		two.title = "Lost in Paris";
		two.genre = "Comedy";
		two.rating = 5;
		two.PlayIt();
		
		Movie three = new Movie();
		three.title = "Bite";
		three.genre = "Horror";
		three.rating = 6;
		
		
	}
}
