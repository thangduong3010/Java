package random_stuff;
/* Practice loop, branching */
public class BeerSong {
	public static void main (String[] args){
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			
			if (beerNum == 1){
				word = "bottle";
			}
			
			if (beerNum > 0){
				System.out.println(beerNum + " " + word + " of beer on the wall");
			}
			else {
				System.out.println("No more bottles of beer on the wall. ");
			} // end if
			
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			beerNum = beerNum - 1;
			
			
		} // end while loop
	} // end main method
} // end class
