package random_stuff;

class RevertString {	 

	static void rev() {
		String s = "Haha motherfucker, I did it. I'm gonna get laid tonight, as a reward";
		revert(s, s.length() - 1);
	}
	
	private static void revert(String s, int index) {
		String a = s;
		int i = index;
		
		System.out.print(a.charAt(i));
		if(i > 0) i--;
		else return;
		revert(a, i);		
	}
}


class Chap6_Ex6 {
	public static void main(String[] args) {
		RevertString.rev();
	}
}
