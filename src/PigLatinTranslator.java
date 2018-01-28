import java.util.Arrays;
import java.util.Scanner;

public class PigLatinTranslator {
	public static void main(String[] args) {		
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		Scanner scan = new Scanner(System.in);
		StringBuilder userPhrase = lowerCaser(scan);
		String[] userPhraseSplit = phraseSplitter(userPhrase);
		String[] userPhraseInPig = toPigLatiner(userPhraseSplit);
		System.out.print(Arrays.asList(userPhraseInPig));
		scan.close();
	}
	public static StringBuilder lowerCaser(Scanner scan) {
		StringBuilder sb = new StringBuilder();
		System.out.print("Enter a line to be translated: ");
		String userPhrase = scan.nextLine().toLowerCase();
		sb.append(userPhrase);
		return sb;
	}
	public static String[] phraseSplitter(StringBuilder phrase) {
		return phrase.toString().split(" ");
	}
	public static String[] toPigLatiner(String[] phrase) {
		String vowels = "aeiou";
		for(int i = 0; i < phrase.length; i++) {
			if (vowels.indexOf(phrase[i].charAt(0)) !=-1){
				phrase[i] = phrase[i] + "way";
			} else {
				phrase[i] = consonantConverter(phrase[i]);
			}			
		}
		return phrase;
		
	}
	public static String consonantConverter(String word) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		String vowels = "aeiou";
		char[] userChar = word.toCharArray();
		sb.append(word);
			
		while (vowels.indexOf(userChar[i]) ==-1) {
			sb.append(userChar[i]);
			i++;
		}		
		return sb.delete(0,i).toString()+"ay";			
	}



}


