package random_stuff;

class GaltoLit {
	public static void main (String args[]) {
		/*double gallons, liters;
		int counter;
		
		counter = 0;
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			counter++;
			if (counter % 10 == 0) {
				System.out.println();
			}
		}*/
		
		double inches, meters;
		int counter = 0;
		
		for (meters = 1; meters <= 144; meters++) {
			inches = meters * 39.37;
			System.out.println(meters + " meters is " + inches + " inches");
			
			counter++;
			if (counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
