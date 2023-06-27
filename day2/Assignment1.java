package week1.day2;

public class Assignment1 {

	public static void main(String[] args) {
		
		int number = -40;
		
		System.out.println("The given input number is "+number);
		
		if (number<0) {
			
			number = number * (-1);
		
			System.out.println("The negative number is converted to positive number : "+number);
		}
		else {
				System.out.println("The input number "+number+" is a positive number");
		
		}
	}

}
