package random_stuff;

class Guess {
	public static void main (String args[]) 
		throws java.io.IOException {
		
		char ch, ignore, answer = 'K';
		
		do {
		System.out.println("I'm thinking of a letter from A to Z");
		System.out.print("Can you guess it? ");
		
		ch = (char) System.in.read();
		
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		
		if (ch == answer)
			System.out.println("Whoa! Motherfucker you are right");
		else {
			System.out.println("Opps, sorry");
			if (ch < answer)
				System.out.println("Too low");
			else
				System.out.println("Too high");
		}
	}	while (ch != answer);
}
}
