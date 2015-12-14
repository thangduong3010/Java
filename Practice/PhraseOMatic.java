/* play with array */
public class PhraseOMatic {
	public static void main (String[] args){
		// create array of strings
		String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive",
				"smart", "six sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"Oh", "Why", "So", "Serious,", "son?", "NULL", "hihi", "I don't know dis",
				"smart", "six sigma", "critical-path", "dynamic"};
		String[] wordListThree = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive",
			"smart", "six sigma", "critical-path", "dynamic"};
		
		// find out how many words in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		// build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println(phrase);
	}
}
