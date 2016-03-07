package random_stuff;
import java.io.*;

class CompFiles {
	public static void main(String[] args) {
		int i = 0, j = 0;
		
		if(args.length != 2) {
			System.out.println("Usage: CompFiles f1 f2");
			return;
		}
		
		try(FileInputStream f1 = new FileInputStream(args[0]);
			FileInputStream f2 = new FileInputStream(args[1])) {
			do {
				i = f1.read();
				j = f2.read();
				if(i != j)
					break;
			} while(i != -1 && j != -1);
			
			if(i != j) {
				System.out.println("Two files are different");
				System.out.println("Difference in f1: " + i);
				System.out.println("Difference in f2: " + j);
			}
			else
				System.out.println("Two files are the same");						
		}
		catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}
