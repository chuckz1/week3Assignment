package week3;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		// --- step one --- \\
		writeQuestionHeader();
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //create array
		ages[ages.length-1] -= ages[0]; //subtract first from last
		System.out.println("A. The last age is: " + ages[ages.length-1]); //should print out 90 since 93 - 3 = 90
		
		ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 55}; //add new age to the array
		ages[ages.length-1] -= ages[0]; //subtract first from last
		System.out.println("B. The last age is: " + ages[ages.length-1]); //should print out 52 since 55 - 3 = 52
		
		//find average of ages array
		//remember that the last age has been changed to 52 instead of 55
		double ageAverage = 0;
		for(int i = 0; i < ages.length; i++) {
			ageAverage += ages[i]; //sum all the ages
		}
		ageAverage /= ages.length; //divide by the amount of ages
		System.out.println("C. The average age is: " + ageAverage);
		
		
		
		
		// --- step two --- \\
		writeQuestionHeader();
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};//create array
		
		//find average number of letters in each name
		double letterAverage = 0;
		for(int i = 0; i < names.length; i++) {
			letterAverage += names[i].length(); //sum all the letters
		}
		letterAverage /= names.length; //divide by the number of names
		System.out.println("A. The average letters per name is: " + letterAverage);
		
		//group all the names into one string
		String nameString = "";
		for(int i = 0; i < names.length; i++) {
			nameString += names[i] + " ";//add each name to the string as well as a space for the next name
		}
		System.out.println("B. " + nameString);
		
		
		
		// --- step three --- \\
		writeQuestionHeader();
		System.out.println("The lase index of an array is (arrayName.lenth-1): " + names[names.length-1]);
		
		
		
		// --- step four --- \\
		writeQuestionHeader();
		System.out.println("The first index of an array is 0: " + names[0]);
		
		
		
		// --- step five --- \\
		writeQuestionHeader();
		
		int[] nameLengths = new int[names.length]; //create array
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); //save each length into the nameLengths array
			System.out.println("Name " + i + " is: " + names[i]); //print out the name for comparison with length
			System.out.println("nameLengths[" + i + "] = " + nameLengths[i] + '\n'); //print out the saved value
		}
		
		
		
		// --- step six --- \\
		writeQuestionHeader();
		int nameLengthsSum = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i]; //sum the length in each index of the array
		}
		System.out.println("Sum of the name lengths: " + nameLengthsSum);
		
		
		
		// --- step seven --- \\
		writeQuestionHeader();
		System.out.println("Duplicate Hello 3 times: " + duplicateWord("Hello", 3));
		
		
		
		// --- step eight --- \\
		writeQuestionHeader();
		System.out.println("My Full Name: " + combineFullName("Charles", "Fehringer"));
		
		
		
		// --- step nine --- \\
		writeQuestionHeader();
		int[] smallArray = new int[] {25, 50};
		System.out.println("Small Array : " + isArraySumGreaterThan100(smallArray));
		int[] largeArray = new int[] {25, 50, 75};
		System.out.println("Large Array : " + isArraySumGreaterThan100(largeArray));
		
		
		
		// --- step ten --- \\
		writeQuestionHeader();
		double[] doubleArray = new double[]{2.55, 6.98, 2.895, 8.873, 2.94585};
		System.out.println("Double Array Average: " + averageDoubleArray(doubleArray));
		
		
		
		// --- step eleven --- \\
		writeQuestionHeader();
		double[] secondLargerDoubleArray = new double[] {2.55, 6.98, 2.895, 8.873, 2.94585, 100};
		double[] secondSmallerDoubleArray = new double[] {2.55, 6.98, 2.895, 8.873, 2.94585, -100};
		System.out.println("Second Larger Array Average: " + averageDoubleArray(secondLargerDoubleArray));//print out for reference
		System.out.println("Does the first array have a gearter average: " + greaterArrayAverage(doubleArray, secondLargerDoubleArray));
		
		System.out.println("Second Smaller Array Average: " + averageDoubleArray(secondSmallerDoubleArray));//print out for reference
		System.out.println("Does the first array have a gearter average: " + greaterArrayAverage(doubleArray, secondSmallerDoubleArray));
		
		
		
		// --- step twelve --- \\
		writeQuestionHeader();
		System.out.println("Will I buy a drink:\n");
		System.out.println("Cold & I have $10.50: \t" + willBuyDrink(false, 10.50));
		System.out.println("Cold & I have $10.51: \t" + willBuyDrink(false, 10.51));
		System.out.println("Hot & I have $10.50: \t" + willBuyDrink(true, 10.50));
		System.out.println("Hot & I have $10.51: \t" + willBuyDrink(true, 10.51));
		
		
		
		// --- step thirteen --- \\
		writeQuestionHeader();
		/*
		 * I needed a way to mark questions in the console
		 * so I wrote a method to print out the current question.
		 * It has a counter that goes up each time it is called.
		 * If only it could do the comments as well.
		 */
	}
	
	//used in question 7
	public static String duplicateWord(String word, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	//used in question 8
	public static String combineFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//used in question 9
	public static boolean isArraySumGreaterThan100(int[] in) {
		int sum = 0;
		for(int i = 0; i < in.length; i++) {
			sum += in[i];
		}
		return sum > 100;
	}
	
	//used in question 10
	public static double averageDoubleArray(double[] in) {
		double result = 0;
		for(int i = 0; i < in.length; i++) {
			result += in[i];
		}
		return (result/in.length);
	}
	
	//used in question 11
	public static boolean greaterArrayAverage(double[] firstArray, double[] secondArray) {
		return averageDoubleArray(firstArray) > averageDoubleArray(secondArray);
	}
	
	//used in question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
	//used in question 13
	public static int questionIndex = 0;
	public static void writeQuestionHeader() {
		questionIndex++;
		System.out.println("\n--- Step " + questionIndex + " ---");
	}
	
}
