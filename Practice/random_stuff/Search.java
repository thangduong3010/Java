package random_stuff;

class Search {
	public static void main(String[] args) {
		int nums[] = {6, 8, 3, 7, 6, 5, 1, 4};
		int val = 6, count = 0;
		boolean found = false;
		
		for(int x: nums) {
			if(x == val){
				found = true;
				count++;
				//break;
			}
		}
		if(found == true)
			System.out.println("Found it. " + count + " appearance(s)");
		else
			System.out.println("Not found.");
	}
}
