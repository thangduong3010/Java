package random_stuff;

class Vehicle2 {
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	// create constructor
	Vehicle2(int x, int y, int z) {
		passengers = x;
		fuelcap = y;
		mpg = z;
	}
	
	int getPassenger() { return passengers; }
	int getFuelCap() { return fuelcap; }
	int getMPG() { return mpg; }
	void setPassenger(int x) { passengers = x; }
	void setFuelCap(int y) { fuelcap = y; }
	void setMPG(int z) { mpg = z; }
	
	int range() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class Truck extends Vehicle2 {
	private int cargocap;
	
	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		
		cargocap = c;
	}
	
	int getCargo() { return cargocap; }
	void putCargo(int c) { cargocap = c; }
}

public class TruckDemo {
	public static void main(String[] args) {
		Truck semi = new Truck(2, 200, 7, 44000);
		double gallons;
		int dist = 322;
		
		gallons = semi.fuelneeded(dist);
		
		System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles, semi needs " + gallons + " gallons of fuel.");
	}
}
