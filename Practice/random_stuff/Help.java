package random_stuff;

class Help {
	public static void main (String args[]) 
		throws java.io.IOException {
		
		char choice, ignore, again;
		
		do {
		
			System.out.println("Help on: ");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.println("\t3. for");
			System.out.println("\t4. while");
			System.out.println("\t5. do-while\n");
			
			
			do {
				System.out.print("Choose one: ");
				choice = (char) System.in.read();
		
				do {
					ignore = (char) System.in.read();
				}
				while (ignore != '\n');
			}
			while (choice < '1' | choice > '5');
		
			switch (choice) {
				case '1':
					System.out.println("The if:\n");
					System.out.println("if (condition) statement;");
					System.out.println("else statement;");
				break;
				case '2':
					System.out.println("The switch:\n");
					System.out.println("switch (expression);");
					System.out.println("\tcase constant:");
					System.out.println("\t\tstatement sequence");
					System.out.println("\t\tbreak;");
					System.out.println("\t// ...");
					System.out.println("}");
				break;
				case '3':
					System.out.println("The for:\n");
					System.out.println("\tfor (init; condition; iteration)");
					System.out.println("\t\tstatement;");
				break;
				case '4':
					System.out.println("The while:\n");
					System.out.println("\twhile (condition)\n\tstatement;");
				break;
				case '5':
					System.out.println("The do-while:\n");
					System.out.println("\tdo {");
					System.out.println("\t\tstatement;");
					System.out.println("} while (condition);");
				break;
				default:
					System.out.println("Selection not found.");
			}
				
			do {
				System.out.print("Look again? (Y|N) ");			
				again = (char) System.in.read();
				do {
					ignore = (char) System.in.read();
				}
				while (ignore != '\n');
			}
			while (again != 'Y' && again != 'N');
		}
		while (again == 'Y');
		
		if (again == 'N')
			System.out.println("*** End of help ***");
	}
}
