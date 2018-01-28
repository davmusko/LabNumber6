import java.util.Scanner;

public class TranslatorApp {

	public static String lowerCaser(Scanner scan) {
		System.out.print("Enter a line to be translated: ");
		return scan.nextLine().toLowerCase();
	}

	public static String[] phraseSplitter(String phrase) {
		return phrase.split(" ");
	}

	public static String[] vowelOrConsonantWordSelector(String[] phrase) {
		String vowels = "aeiou";
		for (int i = 0; i < phrase.length; i++) {
			if (vowels.indexOf(phrase[i].charAt(0)) != -1 ) {
				phrase[i] = vowelConverter(phrase[i]);
			} else {
				phrase[i] = consonantConverter(phrase[i]);
			}
		}
		return phrase;
	}

	public static String consonantConverter(String word) {
		StringBuilder sb = new StringBuilder();
		sb.append(word);
		int i = 0;
		String vowels = "aeiou";
		char[] userChar = word.toCharArray();
		if(!word.startsWith("y")) {
			vowels = vowels + "aeiouy";
		}
		while (vowels.indexOf(userChar[i]) == -1) {
			sb.append(userChar[i]);
			i++;
		}
		return sb.delete(0, i).toString() + "ay";
	}

	public static String vowelConverter(String word) {
		return word + "way";
	}
}
