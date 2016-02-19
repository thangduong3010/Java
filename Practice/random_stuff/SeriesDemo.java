package random_stuff;

class ByTwo implements Series {
	int start, val, prev;
	
	ByTwo() {
		start = 0;
		val = 0;
		prev = -2;
	}
	
	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}
	
	public void reset() {
		val = start;
		prev = start - 2;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = x - 2;
	}
	
	int getPrev() {
		return prev;
	}
}

class SeriesDemo {
	public static void main(String[] args) {
		ByTwo ob = new ByTwo();
		Series ob1;
		
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is: " + ob.getNext() + "\tPrev: " + ob.getPrev());
		
		System.out.println("Resetting...");
		ob.reset();
		
		for(int i = 0; i < 5; i++) {
			ob1 = ob;
			System.out.println("Next value is: " + ob1.getNext());
		}
		
		System.out.println("Starting at 100...");
		ob.setStart(100);
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is: " + ob.getNext() + "\tPrev: " + ob.getPrev());
		
		System.out.println("\nAdding more into array...");
		System.out.println(ob.getNextArray(10));
	}
}
