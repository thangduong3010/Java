package random_stuff;
import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		int i;
		
		if(args.length != 1) {
			System.out.println("Usage: ShowFile file");
			return;
		}
		// try-with-resources. Automatically close the file
		try(FileInputStream fin = new FileInputStream(args[0])) {			
			do {
				i = fin.read();
				if(i != -1) System.out.print((char)i);
			} while(i != -1);
		}
		catch(IOException e) {
			System.out.println("Error reading file");
		}				
	}
}
