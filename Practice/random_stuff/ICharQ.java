package random_stuff;

// a character queue interface
public interface ICharQ {
	void put(char ch) throws QueueFullException; // put a character into the queue
	char get() throws QueueEmptyException; // get a character from the queue
}
