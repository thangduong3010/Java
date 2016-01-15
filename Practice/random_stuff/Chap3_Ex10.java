package random_stuff;

class Chap3_Ex10 {
	public static void main (String args[]) 
		throws java.io.IOException {
		
		char c, ignore;
		int count = 0;
		
		System.out.print("Enter your string (terminate by .): ");
		
		do {
			c = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
			if (c >= 'a' && c <= 'z'){
				c = (char) ((int) c - 32);
				count += 1;
				System.out.println("-> " + c);
			}
		} while (c != '.');
		
		System.out.println("\nYou've been converted " + count + " times.");
	}
}
