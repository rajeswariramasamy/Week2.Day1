package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {
			char[] text1arr = text1.toCharArray();
			char[] text2arr = text2.toCharArray();
			Arrays.sort(text1arr);
			Arrays.sort(text2arr);
			if (Arrays.equals(text1arr, text2arr)) {
				System.out.println("Both text are Anagram");
			} else {
				System.out.println("Both text are not Anagram");
			}
		} else {
			System.out.println("Both text are not Anagram");
		}

	}

}
