package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		String test = "Amazon";
		char[] cArray=test.toCharArray();
		for (int i = cArray.length-1; i >=0; i--) {
			System.out.print(cArray[i]);
		}

	}

}
