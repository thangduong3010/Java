package random_stuff;

class ExcDemo1 {
	public static void main(String[] args) {
		int nums[] = new int[4];
		
		// the code to monitor for errors
		try {
			System.out.println("Before exception is generated");
			
			// generate out-of-bound index
			nums[7] = 10;
			System.out.println("this won't be displayed.");
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Woops! You mad?");
			System.out.println("Standard message:");
			System.out.println(exc);
			System.out.println("\nStack trace:");
			exc.printStackTrace();
		}
		System.out.println("\nAfter exception handled");
	}
}
