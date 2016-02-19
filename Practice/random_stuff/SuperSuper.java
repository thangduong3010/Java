package random_stuff;

class A {
	int i;
}

class B extends A {
	int i; // this i hides the i in A
	
	B(int a, int i) {
		super.i = a; // this means the i in A
		this.i = i; // this is the i in B
	}
	
	void show() {
		System.out.println("i in super class: " + super.i);
		System.out.println("i in subclass: " + i) ;
	}
}

class SuperSuper {
	public static void main(String[] args) {
		B oB = new B(1, 2);
		
		oB.show();
	}
}
