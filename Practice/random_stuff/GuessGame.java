package random_stuff;

public class GuessGame {
	// 3 instance variables for 3 Player objects
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		// create three new player objects
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		// Initialize object's state
		p1.name = "Bob";
		p2.name = "Charles";
		p3.name = "Dave";
		
		// initialize variables
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int target = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9");
		
		while (true) {
			System.out.println("Number to guess is: " + target);
			
			// call method from player
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;			
			guessp2 = p2.number;			
			guessp3 = p3.number;
			
			if (guessp1 == target) {
				p1isRight = true;
			}
			if (guessp2 == target) {
				p2isRight = true;
			}
			if (guessp3 == target) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight){
				System.out.println("We have a winner!");
				System.out.print("And the winner is: ");
				if (p1isRight){
					System.out.print(p1.name + " ");
				}
				if (p2isRight){
					System.out.print(p2.name + " ");
				}
				if (p3isRight){
					System.out.println(p3.name);
				}
				break;
			}
			else {
				System.out.println("Players will have to try again. :(");
				System.out.println("");
			}
		} // end while
	}
}
