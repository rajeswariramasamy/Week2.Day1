package week2.day1;

public class ReverseString {

	public static void main(String[] args) {

		String test = "feeling good";
		String test1 = "";
		int length = test.length();
		for (int i = length - 1; i >= 0; i--) {
			test1 = test1 + test.charAt(i);
		}
		System.out.println(test1);
		
		char[] test2= test.toCharArray();
		String test3 = "";
		for (int j = length - 1; j >= 0; j--) {
			test3 = test3 + test2[j];
		}
		System.out.println(test3);
	
	}
}
