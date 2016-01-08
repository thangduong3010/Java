package random_stuff;

class LogicalOpTable {
	public static void main (String args[]) {
		boolean p, q;
		int m, n;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		m = 1; n = 1;
		System.out.print(m + "\t" + n + "\t");
		System.out.print((m&n) + "\t" + (m|n) + "\t");
		System.out.print((m^n) + "\t");
		if (p){
			System.out.println(0);
		}
		
		p = true; q = false;
		m = 1; n = 0;
		System.out.print(m + "\t" + n + "\t");
		System.out.print((m&n) + "\t" + (m|n) + "\t");
		System.out.print((m^n) + "\t");
		if (p){
			System.out.println(0);
		}
		
		p = false; q = true;
		m = 0; n = 1;
		System.out.print(m + "\t" + n + "\t");
		System.out.print((m&n) + "\t" + (m|n) + "\t");
		System.out.print((m^n) + "\t");
		if (!p){
			System.out.println(1);
		}
		
		p = false; q = false;
		m = 0; n = 0;
		System.out.print(m + "\t" + n + "\t");
		System.out.print((m&n) + "\t" + (m|n) + "\t");
		System.out.print((m^n) + "\t");
		if (!p){
			System.out.println(1);
		}
	}
}
