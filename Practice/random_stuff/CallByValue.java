package random_stuff;

class Test {
	void noChange(int i, int j) {
		i = i + 1;
		j = -j;
	}
	
	int a, b;
	
	Test(int i, int j) {
		a = i;
		b = j;		
	}
	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		/*Test ob = new Test();
		
		int a = 15, b = 20;
		System.out.println("a and b before call: " + a + " " + b);
		
		ob.noChange(a, b);
		System.out.println("After that: " + a + " ");*/
		
		Test ob = new Test(15, 20);
		
		System.out.println("Before: " + ob.a + " " + ob.b);
		
		ob.change(ob);
		System.out.println("After: " + ob.a + " " + ob.b);
	}
}
