package JavaExercise1;

public class IsAPrefixOfAWord {
	public static void main(String[] args) {
		String sentence = "Guitar is my favorite musical instrument.";
		String searchWord = "mus";
		System.out.println("Index: " + getSearchWordIndex(sentence, searchWord));
		
	}
	
	private static int getSearchWordIndex(String sentence, String searchWord) {
		String[] sentenceSplit = sentence.split(" ");
		for (int i = 0; i < sentenceSplit.length; i++) {
			if (sentenceSplit[i].contains(searchWord)) {
				return i + 1;
			}
		}
		return -1;
	}
}
