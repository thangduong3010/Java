package random_stuff;

public class Player {
	int number = 0;
	String name;
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println(name + ": I'm guessing number: " + number);
	}
}
