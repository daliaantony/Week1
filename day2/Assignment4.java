package week1.day2;

public class Assignment4 {

	public static void main(String[] args) {
		//Fibonacci series
		
		int range = 8;
		int firstNum = 0;
		int secondNum = 1;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for (int i = 2; i < range; i++) {
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
			
		}

	}

}
//Learning from the code
//Usage of For loop and the range to be specified
//Had to manually do the calculation to see how the code would work
//interesting to find the initiation number in the loop as 2
