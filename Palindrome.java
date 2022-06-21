package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		String val = "madam";
		String rev = "";
		int len = val.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + val.charAt(i);

		}
		if (val.equalsIgnoreCase(rev)) {
			System.out.println("The given String is Palindrome");
		} else {
			System.out.println("The given String in not a Palindrome");
		}

	}

}
