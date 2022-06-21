package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int occ = 0;
		char[] str1 = str.toCharArray();
		int length = str1.length;
		for (int i = 0; i < length; i++) {
			if (str1[i] == 'e') {
				occ = occ + 1;

			}
		}
		System.out.println(occ);
	}

}
