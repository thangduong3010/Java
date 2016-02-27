package random_stuff;

class ExcDemo2 {
	public static void main(String[] args) {
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};
		
		for(int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
			}			
			catch (ArithmeticException exc) {
				System.out.print(numer[i] + " / " + denom[i] + " = ");
				System.out.println("\"You can't do that!\"");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.print(numer[i] + " / ");
				System.out.println("No matching element found.");
			}
		}
	}
}
