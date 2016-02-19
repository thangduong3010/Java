package random_stuff;

class Bubble {
	public static void main(String args[]) {
		/*int nums[] = {99, -10, 100123, 18, 21, 5632, 463, -9,  287, 49};
		int a, b, t;
		
		System.out.println("Original array: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
		

		for(a = 1; a < nums.length; a++)
			for(b = nums.length - 1; b >= a; b--) {
				if (nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		System.out.println("Sorted array: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();*/
		String s = "This is a test";
		int a, b;
		char ch[] = new char[s.length()];
		
		System.out.println("Original string: ");
		for(a = 0; a < s.length(); a++)
			System.out.print(s.charAt(a));
		System.out.println();
				
		for(a = 0; a < s.length(); a++)
			for(b = 0; b < s.length() - 1; b++) {
				ch[b] = (int)s.charAt(b) > (int)s.charAt(b + 1) ? s.charAt(b + 1) : s.charAt(b);				
			}
		System.out.println("Sorted string:");
		for(a = 0; a < ch.length; a++)
			System.out.print(ch[a]);
	}
}
