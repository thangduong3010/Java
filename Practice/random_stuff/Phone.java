package random_stuff;

class Phone {
	public static void main(String[] args) {
		String numbers[][] = {
				{"Tom", "555-2345"},
				{"Mary", "666-6789"},
				{"John", "123-4567"},
				{"Rachel", "554-1234"}
		};
		int i;
		
		if(args.length != 1)
			System.out.println("Usage: java Phone <name>");
		else {
			for(i = 0; i < numbers.length; i++) {
				if(numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + " : " + numbers[i][1]);
				break;
				}
			}
			if(i == numbers.length)
				System.out.println("Name not found");
		}
			
	}
}
