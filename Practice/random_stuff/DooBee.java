package random_stuff;
// this program is used to convert lower case letter to upper case, more on this later.
public class DooBee{
	public static void main (String[] args){
		char c = 'E';
		
		if (c >= 'A' && c <= 'Z'){
			System.out.println(c);
		}
		else {
			c = (char)((int) c - ('a' - 'A'));
			System.out.println(c);
		}
		
		//System.out.println(args[1]);
}
}