import java.util.Arrays;
import java.util.Scanner;

public class PigLatinTranslator {
	public static void main(String[] args) {		
		String userPhrase;
		String[] userPhraseSplit;
		String[] userPhraseInPig;
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		Scanner scan = new Scanner(System.in);
		userPhrase = TranslatorApp.lowerCaser(scan);
		userPhraseSplit = TranslatorApp.phraseSplitter(userPhrase);
		userPhraseInPig = TranslatorApp.toPigLatiner(userPhraseSplit);
		System.out.print(Arrays.toString(userPhraseInPig));
		scan.close();
	}


}


