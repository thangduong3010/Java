package random_stuff;

class Stack {
	private char[] s;
	private int tos; // top of the stack
	
	public Stack(int size) {
		s = new char[size];
		tos = 0;
	}
	
	public void Push(char ch) {
		if(tos == s.length) {
			System.out.println("Stack is full");
			return;
		}
		s[tos++] = ch;
	}
	
	public char Pop() {
		if(tos == 0) {
			System.out.println("Stack is empty");
			return (char) 0;
		}
		tos--;
		return s[tos];
	}
}


class Chap6_Ex3 {
	public static void main(String args[]) {
		Stack s = new Stack(4);
		
		System.out.println("Pushing...");
		for(int i = 0; i < 4; i++) {
			System.out.print((char) ('A' + i) + " ");
		}
		
		for(int i = 0; i < 5; i++) {
			s.Push((char) ('A' + i));			
		}
		
		System.out.println();
		
		System.out.println("Popping...");
		for(int i = 0; i < 5; i++)
			System.out.print(s.Pop() + " ");
		System.out.println();
	}
}
