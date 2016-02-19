package random_stuff;

class OverLoad {
	void ovlDemo() {
		System.out.println("No parameters");
	}
	void ovlDemo(int a) {
		System.out.println("1 parameter: " + a);
	}
	int ovlDemo(int a, int b) {
		System.out.println("2 parameters: " + a + " " + b);
		return a + b;
	}
	double ovlDemo(double a, double b) {
		System.out.println("2 double parameters: " + a + " " + b);
		return a + b;
	}
	
}

class OverLoadDemo {
	public static void main(String[] args) {
		OverLoad ob = new OverLoad();
		int resI;
		double resD;
		
		ob.ovlDemo();
		System.out.println();
		
		ob.ovlDemo(2);
		System.out.println();
		
		resI = ob.ovlDemo(4, 6);
		System.out.println("Result of 4 and 6: " + resI);
		
		resD = ob.ovlDemo(1.1, 2.3);
		System.out.println("Result of 1.1 and 2.3: " + resD);
	}
}
