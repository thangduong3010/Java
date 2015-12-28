package random_stuff;

class ScopeDemo {
	public static void main (String args[]) {
		int x; // known to all code within main
		
		x = 10;
		if (x == 10) { // new scope
			int y = 20; // known only to this block
			
			// x and y both known here
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// System.out.println(y); // y is not known here
		System.out.println(x); // x is still known here
	}
}
