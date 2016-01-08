package random_stuff;

class SwitchDemo {
	public static void main (String args[]) 
		throws java.io.IOException {
		
		char ch1, ch2;
		
		System.out.print("Enter first character: ");
		ch1 = (char) System.in.read();
		
		
		switch(ch1){
			case 'A':
				System.out.println("This A is in outer switch.");
				System.out.print("Enter second character: ");
				ch2 = (char) System.in.read();
				switch(ch2){
					case 'A':
						System.out.println("This A is in inner switch!");
						break;
					case 'B':
						System.out.println("This B is in inner switch!");
						break;
				}
			break;
			case 'B':
				System.out.println("This B is in outer switch.");
				System.out.print("Enter second character: ");
				ch2 = (char) System.in.read();
				switch(ch2){
				case 'A':
					System.out.println("This A is in inner switch!");
					break;
				case 'B':
					System.out.println("This B is in inner switch!");
					break;
			}
			break;
			default:
				System.out.println("I don't know what the fuck you are talking about");
		}
		
		
	}
}
