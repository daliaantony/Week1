package week1.day3;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("The second largest number in the given array is "+data[data.length -2]);


	}

}
