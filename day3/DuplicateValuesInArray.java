package week1.day3;

import java.util.Arrays;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		
		int[] numbers = {2, 5, 7, 7, 5, 9, 2, 3};
		int length = numbers.length;
		System.out.println("The length of the given array is "+length);
		Arrays.sort(numbers);
		for(int i=0;i<length-1;i++) {
			if(numbers[i]==numbers[i+1])
				System.out.println("The duplicate value in the array is "+numbers[i]);	
		}
		
	}

}
