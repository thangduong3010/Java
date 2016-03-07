package random_stuff;
import java.io.*;

class PrintWriterDemo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 6.2524;
		
		pw.println("Using PrintWriter");
		pw.println(i);
		pw.println(d);
		
		pw.println(i + " + " + d + " is " + (i + d));
	}
}
