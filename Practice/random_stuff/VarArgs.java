package random_stuff;

class VarArgs {
	
	static void vaTest(int ... v) {
		System.out.println("Numbers of arg: " + v.length);
		System.out.print("Contents: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1,2,3,4);
		vaTest();
	}
}
