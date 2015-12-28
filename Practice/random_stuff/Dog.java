package random_stuff;

class Dog {
	int size;
	String breed;
	String name;
	
	void bark(){
		System.out.println(name + " says Ruff!");
	}
	
	void eat(String food){
		if (name == "Timmy" && food == "cheese")
			System.out.println(name + ": I don't eat cheese. Gimme snacks");
		else
			System.out.println("Yum yum!");
	}
}
