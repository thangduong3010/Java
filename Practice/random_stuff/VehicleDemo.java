package random_stuff;

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	// create constructor
	Vehicle(int x, int y, int z) {
		passengers = x;
		fuelcap = y;
		mpg = z;
	}
	
	int range() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class VehicleDemo {
	public static void main (String args[]) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		//int range;
		double gallons;
		int dist = 252;

		System.out.println("Minivan can carry " + minivan.passengers + ". Range is " + minivan.range());
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles, minivan needs " + gallons + " gallons of fuel");
		
	}
}
