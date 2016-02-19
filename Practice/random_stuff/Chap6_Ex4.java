package random_stuff;

class Damn {
	int a;
	
	Damn(int i) {
		a = i;
	}
	
	static void swap(Damn t1, Damn t2) {
		int t = t1.a;
		t1.a = t2.a;
		t2.a = t;				
	}
}

class Chap6_Ex4 {
	public static void main(String[] args) {
		Damn t1 = new Damn(1);
		Damn t2 = new Damn(2);
		
		System.out.println("Content of t1: " + t1.a);
		System.out.println("Content of t2: " + t2.a);
		System.out.println("Swapping...");
		
		Damn.swap(t1, t2);
		System.out.println("Content of t1: " + t1.a);
		System.out.println("Content of t2: " + t2.a);
		
	}
}
