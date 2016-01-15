package random_stuff;

class Chap3_Ex1 {
	public static void main (String args[]) 
		throws java.io.IOException {
		
		char c;
		int count = 0;
		
		System.out.print("Enter your string (Terminate by .): ");
		do {
			c = (char) System.in.read();
			if (c == ' ')
				count += 1;
		} while (c != '.');
		System.out.println();
		System.out.println("You've entered " + count + " spaces.");
	}

}
