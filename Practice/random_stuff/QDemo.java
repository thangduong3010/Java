package random_stuff;

class Queue {
	private char q[]; // hold the queue
	private int putloc, getloc; // put and get indices
	
	public Queue(int size) {
		q = new char[size]; // allocate memory for queue
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
	
}


class QDemo {
	public static void main (String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Using bigQ to store the alphabet.");
		for(i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));
		
		// retrieve and display
		System.out.print("Contents of bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch + " ");
		}
		
		System.out.println();
		
		System.out.println("Using smallQ to generate errors.");
		for(i = 0; i < 5; i++) {
			System.out.print("Attempting to store " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		System.out.print("Contents of smallQ: ");
		for(i = 0; i < 5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0)
				System.out.print(ch + " ");
		}		
	}
}
