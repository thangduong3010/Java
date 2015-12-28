package random_stuff;

public class Doggy {
	public static void main (String[] args){
		Dog[] myDogs = new Dog[3];
		
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = new Dog();
		
		myDogs[0].name = "Timmy";
		myDogs[1].name = "Canny";
		myDogs[2].name = "Lanny";
		
		System.out.println("I have " + myDogs.length + " dogs. They are: ");
		for (int i = 0; i < myDogs.length; i++){
			System.out.println(myDogs[i].name);
		}
		
		System.out.println("Okay, bark for me boys!");
		for (int i = 0; i < myDogs.length; i++){
			myDogs[i].bark();
		}
		
		System.out.println("Good boy. Now eat your cheese");
		for (int i = 0; i < myDogs.length; i++){
			myDogs[i].eat("cheese");
		}
	}
}
