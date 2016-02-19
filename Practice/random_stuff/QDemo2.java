package random_stuff;

class Queue2 {
	private char q[]; // hold the queue
	private int putloc, getloc; // put and get indices
	
	public Queue2(int size) {
		q = new char[size]; // allocate memory for queue
		putloc = getloc = 0;
	}
	
	public Queue2(Queue2 ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		for(int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}
	
	public Queue2(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for(int i = 0; i < a.length; i++)
			put(a[i]);
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

class QDemo2 {
	public static void main(String[] args) {
		Queue2 q1 = new Queue2(10);
		
		char[] name = {'T', 'o', 'm'};
		Queue2 q2 = new Queue2(name);
		
		char ch;
		int i;
		
		for(i = 0; i < 10; i++)
			q1.put((char) ('A' + i));
		
		Queue2 q3 = new Queue2(q1);
		System.out.println("Contents of q1:");
		for(i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println("Contents of q2:");
		for(i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println();
		
		System.out.println("Contents of q3:");
		for(i = 0; i < 3; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
}
