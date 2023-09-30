package week04;

import java.util.Random;

public class wwek04CodingAssignment {

	public static void main(String[] args) {

		// Problem 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1. a.
		// Index ages.length -1 gives us the last element in the Array, index 0 gives us the first
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		//1.b.
		int[] newArray = {9, 8, 13, 40, 74, 18, 49, 28, 89};
		int newResult = newArray[newArray.length - 1] - newArray[0];
		System.out.println(newResult);
		
		//1.c.
		int sum = 0;
		for (int age : ages) {
			//loop through Array and add together all the ages
			sum += age;
		}
		//outside of loop divide by number of elements and print
		System.out.println(sum/ages.length);
		
		
		// Problem 2

		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2.a.
		// initialize variable to add lengths to
		int length = 0;
		for (String name : names) {
			length += name.length();
		}
		System.out.println(length/names.length);

		//2.b.
		// initialize StringBuilder variable to hold concat String
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
			// Use .append to add each name and a space
			concatenatedNames.append(name + " ");
		}
		System.out.println(concatenatedNames);
		
		
		//Problem 3
		//How do you access the last element of any Array?
		// Array[Array.length - 1]
		
		
		//Problem 4
		//How do you access the first element of any Array?
		// Array[0]
		
		
		//Problem 5
		// Create new Array with same length as names Array
		int[] nameLengths = new int[names.length];
		// add length of each item in original Array to new Array
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		//Problem 6
		int lengthSum = 0;
		// add the length of each name to the total
		for (int nameLength : nameLengths) {
			lengthSum += nameLength;
		}
		System.out.println(lengthSum);
		
		
		//Problem 7
		System.out.println(repeatedString("Hello", 3));
		
		
		//Problem 8
		System.out.println(createFullName("Avril", "Lavigne"));
		
		
		//Problem 9
		int[] testArray = {10, 3, 8, 1, 30, 20};
		System.out.println(greaterThan100(testArray));
		
		
		//Problem 10
		double[] dArray1 = {11.11, 13.42, 57.52, 78.24, 68.78, 18.62};
		System.out.println(doubleAverage(dArray1));
		
		
		//Problem 11
		double[] dArray2 = {84.18, 1.41, 1.02, 3.98, 83.56};
		System.out.println(compareAverage(dArray1, dArray2));
		
		//Problem 12
		boolean isHotOutside = false;
		double moneyInPocket = 15.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//Problem 13
		String[] gameNames = {"Grace", "Nicole", "Madeline", "Harrison"};
		System.out.println(whoGoesFirst(gameNames));
		

		



		

	}
	
	// Method 7
	public static String repeatedString(String word, int n) {
		String result = "";
		// add the word to the String each time the loop runs
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	
	// Method 8
	public static String createFullName(String firstName, String lastName) {
		return (firstName + " " + lastName);
	}
	
	
	// Method 9
	public static boolean greaterThan100(int[] Array) {
		int sum = 0;
		// add each num in Array to the sum
		for (int num : Array) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// Method 10
	public static double doubleAverage(double[] Array) {
		double average = 0.00;
		// sum all the values in Array
		for (double d : Array) {
			average += d;
		}
		// divide sum by number of elements to create average
		average /= Array.length;
		return average;	
	}
	
	
	// Method 11
	public static boolean compareAverage(double[] Array1, double[] Array2) {
		double average1 = 0.00;
		double average2 = 0.00;
		
		// find average of Array1
		for (double num : Array1) {
			average1 += num;
		}
		average1 /= Array1.length;
		
		//find average of Array2
		for (double num : Array2) {
			average2 += num;
		}
		average2 /= Array2.length;
		
		// compare averages
		if (average1 > average2) {
			return true;
		}
		else {
			return false;
		}							
	}
	
	
	// Method 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// Method 13
	// randomly select name from Array to determine who goes first in a game so that my children stop fighting over who goes first
	public static String whoGoesFirst(String[] Array) {
		Random random = new Random();
		// this will create a random integer between 0 (inclusive) and the length of the Array (exclusive)
		//it will then return the item in the Array at that position
		String randomName = Array[random.nextInt(Array.length)];
		return randomName;
	}

}
