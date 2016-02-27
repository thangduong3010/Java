package random_stuff;

class FixedQueue1 implements ICharQ {
	private char q[];
	private int putloc, getloc;
	
	public FixedQueue1(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	public void put(char ch)
		throws QueueFullException {
			
		if(putloc == q.length)
			throw new QueueFullException(q.length);
			
		q[putloc++] = ch;
		}
	
	
	public char get()
		throws QueueEmptyException {
		
		if(getloc == putloc)
			throw new QueueEmptyException();
		
		return q[getloc++];
	}
}

class QExcDemo {
	public static void main(String[] args) {
		FixedQueue1 q = new FixedQueue1(10);
		char ch;
		int i;
		
		try{
			for(i = 0; i < 11; i++) {
				System.out.print("Attempting to store: " + (char)('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch(QueueFullException e) {
			System.out.println(e);
		}
		
		try {
			for(i = 0; i < 11; i++) {
				System.out.print("Getting the next char: ");
				ch = q.get();
				System.out.println(ch);
			}
		}
		catch(QueueEmptyException e) {
			System.out.println(e);
		}
	}
}
