package random_stuff;

// a fixed-size queue
class FixedQueue implements ICharQ {
	private char q[]; // this array holds queue
	private int putloc, getloc;
	
	// Construct an empty queue
	public FixedQueue(int size) {
		q = new char[size]; // alloc memory for queue
		putloc = getloc = 0;
	}
	
	// put a char into the queue
	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println("Queue is full");
			return;
		}
		q[putloc++] = ch;
	}
	
	// get a char from the queue
	public char get() {
		if(getloc == putloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
}

// a circular queue
class CircularQueue implements ICharQ {
	private char q[];
	private int getloc, putloc;
	
	public CircularQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("Queue is full.");
			return;
		}
		q[putloc++] = ch;
		if(putloc == q.length) putloc = 0; // loopback
	}
	
	public char get() {
		if(getloc == putloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		char ch = q[getloc++];
		if(getloc == q.length) getloc = 0;
		return ch;
	}
}

// dynamic queue
class DynamicQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;
	
	public DynamicQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc == q.length) {
			// increase size of queue
			char t[] = new char[q.length * 2];
			
			// copy elements
			for(int i = 0; i < q.length; i++)
				t[i] = q[i];
			
			q = t;
		}
		q[putloc++] = ch;
	}
	
	public char get() {
		if(getloc == putloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class IQDemo {
	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		DynamicQueue q2 = new DynamicQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		ICharQ iQ;
		
		char ch;
		int i;
		iQ = q1;
		// put char into fixed queue
		for(i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		// show the queue
		System.out.print("Fixed queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " ");
		}
		System.out.println();
		
		iQ = q2;
		// put char into dynamic queue
		for(i = 0; i < 20; i++)
			iQ.put((char) ('Z' - i));
		
		// show the queue
		System.out.print("Dynamic queue: ");
		for(i = 0; i < 20; i++) {
			ch = iQ.get();
			System.out.print(ch + " ");
		}
		System.out.println();
		
		iQ = q3;
		// put char into circular queue
		for(i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		// show the queue
		System.out.print("Circular queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("Putting more char into circular queue...");
		for(i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));
		
		// show the queue
		System.out.print("Circular queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}
