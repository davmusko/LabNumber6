import java.util.Scanner;

public class PigLatinTranslator {
	public static void main(String[] args) {
		String reRun;
		String userPhrase;
		String[] userPhraseSplit;
		String[] userPhraseInPig;
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		do {
			Scanner scan = new Scanner(System.in);
			userPhrase = TranslatorApp.lowerCaser(scan);
			userPhraseSplit = TranslatorApp.phraseSplitter(userPhrase);
			userPhraseInPig = TranslatorApp.toPigLatiner(userPhraseSplit);
			
			
			for (int i = 0; i < userPhraseInPig.length; i++) {
				System.out.print(userPhraseInPig[i] + " ");
			}
			System.out.println("\nWould you like to translate another word/phrase? (esyay/onay): ");
			reRun = scan.nextLine();
			
		} while(reRun.equalsIgnoreCase("esyay")|| reRun.equalsIgnoreCase("yes")|| reRun.equalsIgnoreCase("y"));
		
		
		
	}


}


