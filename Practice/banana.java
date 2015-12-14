// this is for training
class banana {
	public static void main(String args[]){
		int x = 3;
		String name = "Thang";
		x = x * 17;
		
		System.out.println("Hello " + name);
		System.out.println("x is " + x);
		
		while (x > 12) {
			x = x - 1;
		}
		
		for (x = 0; x < 10; x++){
			System.out.println("x is now " + x);
		}
		
		if (x == 10) {
			System.out.println("x must be 10");
		}
		else {
			System.out.println("x isn't 10");
		}
		
		
	}
}
