package random_stuff;

class ThisClass {
	int x;
	
	ThisClass() {
		System.out.println("Inside MyClass()");
		x = 0;
	}
	
	ThisClass(int i) {
		System.out.println("Inside MyClass(int)");
		x = i;
	}
	
	ThisClass(double d) {
		System.out.println("Inside MyClass(double)");
		x = (int)d;
	}
}

class OverloadConsDemo {
	public static void main(String[] args) {
		ThisClass t1 = new ThisClass();
		ThisClass t2 = new ThisClass(88);
		ThisClass t3 = new ThisClass(1.2);
		
		System.out.println("t1.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);
		System.out.println("t3.x: " + t3.x);
	}
}
