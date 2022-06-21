package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] arr = test.toCharArray();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (Character.isLetter(arr[i])) {
				++letter;
			} else if (Character.isDigit(arr[i])) {
				++num;
			} else if (Character.isSpaceChar(arr[i])) {
				++space;
			} else {
				++specialChar;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}