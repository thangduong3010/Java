package random_stuff;
import java.io.*;

import java.io.DataOutputStream;

class RWData {
	public static void main(String[] args) {
		int i = 10;
		double d = 1023.56;
		boolean b = true;
		
		try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
			System.out.println("Writing " + i);
			dataOut.writeInt(i);
			
			System.out.println("Writing " + d);
			dataOut.writeDouble(d);
			
			System.out.println("Writing " + b);
			dataOut.writeBoolean(b);
		}
		catch(IOException e) {
			System.out.println("Write error");
		}
		System.out.println();
		
		try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			
			b = dataIn.readBoolean();
			System.out.println("Reading " + b);			
		}
		catch(IOException e) {
			System.out.println("Read error");
		}
		
	}
}
