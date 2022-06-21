package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String input = "I am a software tester";
		
		String[] arr = input.split(" ");
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (i % 2 != 0) {
				char[] charArray = arr[i].toCharArray();

				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}

				System.out.print(" ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}

	}
}