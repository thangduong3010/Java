package random_stuff;

class HelpMenu {
	void HelpOn(int what) {
		switch (what) {
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
		case '6':
			System.out.println("The break:\n");
			System.out.println("\tbreak;");
			System.out.println("\tor break label;");
			break;
		case '7':
			System.out.println("The continue:\n");
			System.out.println("\tcontinue;");
			System.out.println("\tor continue label;");
			break;
		default:
			System.out.println("Selection not found.");
		}
		System.out.println();
	}
	
	void ShowMenu() {
		System.out.println("Help on: ");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for");
		System.out.println("\t4. while");
		System.out.println("\t5. do-while");
		System.out.println("\t6. break");
		System.out.println("\t7. continue\n");
		System.out.println("Choose one (q to quit): ");					
	}
	
	boolean isValid(int ch) {

		if (ch < '1' | ch > '7' & ch != 'q')
			return false;
		else
			return true;
	}
	
	boolean playAgain(char ch) {
		if (ch == 'N' || ch == 'Y')
			return false;
		else
			return true;			
	}
}

class HelpClassDemo {
	public static void main(String args[]) 
		throws java.io.IOException {
		
		char choice, ignore, again;
		HelpMenu hlobj = new HelpMenu();
		
		for(;;) {
			do {
				hlobj.ShowMenu();
				
				choice = (char) System.in.read();
				
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while (!hlobj.isValid(choice));
			
			if(choice == 'q')
			{
				System.out.println("*** End of help ***");
				break;
			}
			System.out.println("\n");
			hlobj.HelpOn(choice);
			
			do {
				System.out.print("Do you need more help? (Y|N): ");
				again = (char) System.in.read();
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while (hlobj.playAgain(again));
			
			if (again == 'Y')
				continue;
			if (again == 'N')
			{
				System.out.println("*** End of help ***");
				break;
			}
		}
	}
}
