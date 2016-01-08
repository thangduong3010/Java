package random_stuff;

class PrimeNum {
	public static void main (String args[]) {
		int x, y;
		boolean isPrime;
		
		for (x = 2; x < 100; x++) {
			isPrime = true;
			
			for (y = 2; y <= x / y; y++) {
				if (x % y == 0)
					isPrime = false;
					
			}
			if (isPrime)
				System.out.print(x + " ");
			
		}
	}
}
